package com.company.reflect;

import com.company.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class GetFieldDemo {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /*
         * 获取字段。
         */
        getFieldDemo();
    }

    public static void getFieldDemo() throws Exception {

        String className = "com.company.domain.Person";
        Class clazz = Class.forName(className);

        String fieldName = "age";

        //获取age字段对象。
//		Field field = clazz.getField(fieldName);//获取是公共的字段。
        Field field = clazz.getDeclaredField(fieldName);

//		getXXX:获取都是类中公共的成员。
//		getDeclaredXXX:获取本类中已有的成员。
//		System.out.println(field);

        //对其进行值的设置，必须先有对象。
        Object obj = clazz.getDeclaredConstructor().newInstance();


        //通过查找父类AccessiableObject的方法。setAccessiable(true);
        field.setAccessible(true);//取消权限检查，暴力访问。一般不访问私有。
        field.set(obj, 30);//IllegalAccessException:age字段是私有的。

        System.out.println(field.get(obj));
    }
}
