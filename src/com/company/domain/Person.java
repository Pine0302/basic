package com.company.domain;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
        System.out.println("person run");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int temp = this.age - o.age;
        return temp == 0 ? this.name.compareTo(o.name) : temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void show(String name, int age) {
        System.out.println("show run...name=" + name + ",age=" + age);
    }

    public static void staticShow() {
        System.out.println("static show run ");
    }

}
