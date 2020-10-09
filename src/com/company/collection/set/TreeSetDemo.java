package com.company.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import com.company.collection.Student;
import com.company.collection.comparator.ComparatorByName;

public class TreeSetDemo  {
    public static void main(String[] args) {
        Set treeSet = new TreeSet(new ComparatorByName());

        treeSet.add(new Student("lisi1",20));
        treeSet.add(new Student("lisi4444",21));
        treeSet.add(new Student("lisi22",28));
        treeSet.add(new Student("lisi333",29));

        for (Iterator iterator = treeSet.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        for (Object obj:treeSet) {
            Student student = (Student) obj;
            System.out.println(student);
        }

    }
}
