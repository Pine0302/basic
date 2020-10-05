package com.company.compareDemo;

public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Person("lisi", 20);
        Person p2 = new Person("wangcai", 23);

        System.out.println(p1.compareTo(p2));
    }
}
