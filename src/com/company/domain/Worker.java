package com.company.domain;

public class Worker extends Person {
    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
