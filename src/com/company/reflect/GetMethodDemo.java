package com.company.reflect;


import java.lang.reflect.Method;

public class GetMethodDemo {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {


        /*
         * 获取方法。
         */

        getMethodDemo2();
    }

    public static void getMethodDemo2() throws Exception {

        String className = "com.company.domain.Person";
        Class clazz = Class.forName(className);
        String methodName = "staticShow";

        Method method = clazz.getMethod(methodName, null);
        method.invoke(null, null);
    }

    public static void getMethodDemo() throws Exception {

        String className = "com.company.domain.Person";
        Class clazz = Class.forName(className);

        String methodName = "show";

        Method method = clazz.getMethod(methodName, String.class,int.class);
        Object obj = clazz.newInstance();
        method.invoke(obj, "wangcai",20);
    }


}
