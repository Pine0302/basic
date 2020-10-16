package com.company.collection.map;

import com.company.domain.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        /*
         * 存储中英文星期。
         * 使用map集合。
         */
        Map<Student,String> map = new HashMap<Student,String>();
        //Map<Student,String> map = new LinkedHashMap<Student,String>();

        map.put(new Student("lisi",20),"上海");
        map.put(new Student("wangwu",22),"北京");
        map.put(new Student("zhaoliu",21),"成都");
        map.put(new Student("zhouqi",28),"广州");
        map.put(new Student("wangwu",22),"南京");

        for (Student key: map.keySet()){
            String city = map.get(key);
            System.out.println("Student:"+key.toString()+" city:"+city);
        }


    }
}
