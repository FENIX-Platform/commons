package org.fao.fenix.commons.msd.dto.templates;

import com.orientechnologies.orient.object.db.OObjectLazyMap;
import javassist.util.proxy.MethodHandler;
import org.fao.fenix.commons.msd.dto.JSONEntity;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public abstract class ResponseHandler extends JSONEntity implements MethodHandler {

    private static final Set<String> returnedDTOChecked = new HashSet<>();
    private static final Set<String> returnCollectionOfDTO = new HashSet<>();
    private static final Map<String, Class<? extends ResponseHandler>> returnedDTO = new HashMap<>();


    private Object[] sources;
    private Class sourceClass;

    public ResponseHandler() {}
    public ResponseHandler(Object ... sources) {
        this.sources = sources; //Multiple sources to support inheritance
        sourceClass = sources!=null && sources.length>0 ? sources[0].getClass() : null;
    }

    @Override
    public Object invoke(Object self, Method m, Method processed, Object[] args) throws Throwable {


        //Retrieve informations from cache
        String key = this.getClass().getName()+'.'+m.getName();
        Class<? extends ResponseHandler> returnHandlerClass = returnedDTO.get(key);
        boolean collection = returnCollectionOfDTO.contains(key);

        //Update cache if necessary
        if (!returnedDTOChecked.contains(key)) {
            Type returnType = m.getGenericReturnType();
            Class returnClass = m.getReturnType();
            if (collection = Collection.class.isAssignableFrom(returnClass)) {
                Class elementsClass = (Class) ((ParameterizedType) returnType).getActualTypeArguments()[0];
                if (JSONEntity.class.isAssignableFrom(elementsClass))
                    returnedDTO.put(key, returnHandlerClass = (Class<? extends ResponseHandler>)elementsClass);
                returnCollectionOfDTO.add(key);
            } else {
                if (JSONEntity.class.isAssignableFrom(returnClass))
                    returnedDTO.put(key, returnHandlerClass = (Class<? extends ResponseHandler>)returnClass);
            }
            returnedDTOChecked.add(key);
        }

        //Call original bean method stack
        Object sourceReturn = !"getRID".equals(m.getName()) ? processed.invoke(self) : null; //Priority to the current bean
        try {
            Method sourceMethod = sourceClass.getMethod(m.getName());

            if (m.getReturnType().isAssignableFrom(Map.class)) { //Manage multilanguage labels
                sourceReturn = new HashMap<>();
                for (int i=sources.length-1; i>=0; i--) {
                    Map sourceReturnValue = (Map)sourceMethod.invoke(sources[i]);
                    if (sourceReturnValue!=null)
                        ((Map) sourceReturn).putAll(sourceReturnValue instanceof OObjectLazyMap ? ((OObjectLazyMap)sourceReturnValue).getUnderlying() : sourceReturnValue);//TODO manage orient bug intead of this workaround
                }
                if (((Map) sourceReturn).size()==0)
                    sourceReturn = null;
            } else if (m.getReturnType().isAssignableFrom(Collection.class)) { //Manage collection values
                sourceReturn = new LinkedList<>();
                for (int i=sources.length-1; i>=0; i--) {
                    Collection sourceReturnValue = (Collection)sourceMethod.invoke(sources[i]);
                    if (sourceReturnValue!=null)
                        ((Collection) sourceReturn).addAll(sourceReturnValue);
                }
                if (((Collection) sourceReturn).size()==0)
                    sourceReturn = null;
            } else
                for (int i=0; i<sources.length && sourceReturn==null ; i++) //Manage single values
                    sourceReturn = sourceMethod.invoke(sources[i]);
        } catch (NoSuchMethodException ex) { }

        //Return response
        if (returnHandlerClass!=null) //Override response if recursion is needed
            if (collection)
                return ResponseBeanFactory.getInstances((Collection)sourceReturn, returnHandlerClass);
            else
                return ResponseBeanFactory.getInstance(sourceReturn, returnHandlerClass);
        else //Return original response
            return sourceReturn;
    }
}
