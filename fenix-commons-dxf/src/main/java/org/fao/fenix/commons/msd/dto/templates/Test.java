package org.fao.fenix.commons.msd.dto.templates;

import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Test.class.getConstructor(Object[].class).newInstance(new Object[]{0,1,2,3,4,5,6,7,8,9});
    }

    Test(Object[] test) {
        System.out.println("ok "+test.length);
    }
}
