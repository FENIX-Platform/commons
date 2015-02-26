package org.fao.fenix.commons.utils;

import javax.servlet.ServletRequest;
import java.util.*;

public class Order extends LinkedHashMap<String,Order.Sort> {
    enum Sort {
        ASC("ascendent","ascending","standard","default","asc","std","def","a"),DESC("descendent","descending","inverse","desc","d","alternative","alternate","opposite");
        private Set<String> names = new HashSet<>();
        private Sort(String ... names) {
            this.names.addAll(Arrays.asList(names));
        }

        static Sort getByName(String name) {
            if (name!=null && name.trim().length()>0) {
                name = name.toLowerCase();
                for (Sort sort : Sort.values())
                    if (sort.names.contains(name))
                        return sort;
            }
            return null;
        }
    }

    private Language[] languages;

    public Order(ServletRequest request, Language[] languages) {
        setOrder(request.getParameter("order"));
        this.languages = languages;
    }
    public Order(String orderingParameter) {
        setOrder(orderingParameter);
    }

    public void setOrder(String orderingParameter) {
        clear();
        if (orderingParameter!=null)
            for (String order : orderingParameter.split(",")){
                String[] orderEntry = order.split(":");
                put(orderEntry[0], orderEntry.length>1 ? Sort.getByName(orderEntry[1]) : Sort.ASC);
            }
    }


    //Utils
    public String toH2SQL(String ... codeColumnsId) {
        Set<String> codeColumns = new HashSet<>();
        Language language = languages!=null && languages.length>0 ? languages[0] : null;
        if (languages!=null && codeColumnsId!=null)
            codeColumns.addAll(Arrays.asList(codeColumnsId));

        StringBuilder buffer = new StringBuilder();
        for (Map.Entry<String,Sort> orderEntry : entrySet())
            buffer.append(", ").append(orderEntry.getKey()).append(codeColumns.contains(orderEntry.getKey()) ? '_'+language.getCode() : "").append(' ').append(orderEntry.getValue().name());
        return size()>0 ? " ORDER BY"+buffer.substring(1) : "";
    }

    public String toOrientSQL() {
        StringBuilder buffer = new StringBuilder();
        for (Map.Entry<String,Sort> orderEntry : entrySet())
            buffer.append(", ").append(orderEntry.getKey()).append(' ').append(orderEntry.getValue().name());
        return size()>0 ? " order by"+buffer.substring(1) : "";
    }


}
