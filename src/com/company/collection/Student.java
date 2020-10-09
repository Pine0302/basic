package com.company.collection;



import com.company.collection.comparator.ComparatorByLength;

import java.util.Objects;

public class Student implements Comparable {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name1='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {


        if(!(o instanceof Student)){
            throw new ClassCastException();
        }
        Student stu = (Student)o;

//		if(this.age>stu.age)
//			return 1;
//		if(this.age<stu.age)
//			return -1;

        /*
         * 注意：在比较时，必须明确主次。主要条件相同，继续比较次要条件。
         */
        int temp = this.age - stu.age;

        return temp==0?this.name.compareTo(stu.name):temp;
    }
}
