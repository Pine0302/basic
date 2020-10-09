package com.company.collection.set;

import com.company.collection.Student;
import com.company.collection.comparator.ComparatorByLength;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        Set treeSet = new TreeSet(Collections.reverseOrder(new ComparatorByLength()));

        treeSet.add("pine");
        treeSet.add("nba");
        treeSet.add("cba");
        treeSet.add("hanser");
        treeSet.add("ge");




        for (Iterator iterator = treeSet.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }


    }
}
