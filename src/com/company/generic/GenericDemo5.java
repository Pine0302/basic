package com.company.generic;

import com.company.domain.Student;

import java.util.*;

public class GenericDemo5 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("pine1",20));
        list.add(new Student("pine2",21));
        list.add(new Student("pine3",22));
        printList(list);

        Set<Student> set = new HashSet<Student>();
        set.add(new Student("pine4",20));
        set.add(new Student("pine5",21));
        set.add(new Student("pine6",22));
        printList(set);

        List<String> list1 = new ArrayList<String>();
        list1.add("pine1");
        list1.add("pine2");
        list1.add("pine3");
        printList(list1);
    }

    /**
     * 打印集合中的元素
     * 当使用泛型类或者接口时，传递的具体类型不确定，可以通过通配符（?）来表示。
     * @param list
     */
    private static void printList(Collection<?> list) {
        for (Iterator<?> iterator = list.iterator(); iterator.hasNext() ;) {
         //   Student student = iterator.next();
            System.out.println(iterator.next().toString());
        }
    }

}

