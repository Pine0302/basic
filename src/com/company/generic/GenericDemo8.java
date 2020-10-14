package com.company.generic;


import com.company.domain.Person;
import com.company.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;


public class GenericDemo8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         *  泛型的限定在api中的使用。上限的体现。
         *  TreeSet(Collection<? extends E> c)
         *
         *
         */
        //创建一个Collection.
        Collection<Student> c = new ArrayList<Student>();
        c.add(new Student("wangcai1",26));
        c.add(new Student("wangcai2",29));

        //TreeSet集合在创建时，就将c中的存储到Treeset集合。
        TreeSet<Person> ts = new TreeSet<Person>(c);

        ts.add(new Person("lisi",20));

        for (Iterator<Person> it = ts.iterator(); it.hasNext();) {
            Person person =  it.next();
            System.out.println(person);

        }


    }

}

/*
 * class TreeSet<E>{
 * 		TreeSet(Collection<? extends E> c){}
 */





