package com.company.collection.set;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * 提高唯一性元素的查询效率，还想有序，可使用HashSet的子类LinkedHashSet.
         */
        Set set = new LinkedHashSet();

        set.add("abcd");
        set.add("hahahah");
        set.add("java");
        set.add("itcast");

        for (Iterator it = set.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

    }


}
