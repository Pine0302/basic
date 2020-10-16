package com.company.collection.map;

import com.company.collection.comparator.GenericComparatorByName;
import com.company.domain.Student;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        /*
         * 练习二： 学生对象(姓名，年龄)都有自己的归属地，既然有对应关系。 将学生对象和归属地存储到map集合中。
         * 注意：同姓名同年龄视为重复的键。 按照学生的年龄进行从小到大的排序。 TreeMap。
         *
         * 如果要对学生按照姓名排序呢？
         */
        Map<Student,String> map = new TreeMap<Student,String>(new GenericComparatorByName());
        map.put(new Student("zhouqi",28),"广州");
        map.put(new Student("lisi",20),"上海");
        map.put(new Student("wangwu",22),"北京");
        map.put(new Student("zhaoliu",21),"成都");
        map.put(new Student("anzhula",30),"广东");

        for (Map.Entry<Student,String> me : map.entrySet()){
            Student key = me.getKey();
            String city = me.getValue();
            System.out.println("Student: "+key.toString()+" city:"+city);
        }



    }
}
