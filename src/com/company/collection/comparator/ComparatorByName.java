package com.company.collection.comparator;

import com.company.collection.Student;

import java.util.Comparator;

public class ComparatorByName implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        int temp = student1.getName().compareTo(student2.getName());
        return (temp==0) ? (student1.getAge()-student2.getAge()):temp;
    }
}
