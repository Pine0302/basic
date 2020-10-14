package com.company.generic;

import com.company.domain.Person;
import com.company.domain.Student;
import com.company.domain.Worker;

import java.util.*;

public class GenericDemo6 {
    public static void main(String[] args) {
        List<Student> listStu = new ArrayList<Student>();
        listStu.add(new Student("pine1",20));
        listStu.add(new Student("pine2",21));
        listStu.add(new Student("pine3",22));
        printList(listStu);
        List<Worker> listWorker = new ArrayList<Worker>();
        listWorker.add(new Worker("pine4",24));
        listWorker.add(new Worker("pine5",25));
        listWorker.add(new Worker("pine6",26));
        printList(listWorker);
    }

    /**
     * 打印集合中的元素
     * 当使用泛型类或者接口时，传递的具体类型不确定，可以通过通配符（?）来表示。
     * 如果想要对被打印的集合中的元素类型进行限制，只在指定的一些类型，进行打印
     * 使用泛型的限定  < ? extends Person >  ：接收Person类型或者Person的子类型
     *
     * 总结：
     * < ? extends E > 接收E类型或者E的子类型  上限
     * < ? super E > 接收E类型或者E的父类型    下限
     *
     *
     *
     *只需要打印学生和工人的集合。找到学生和工人的共性类型Person
     * @param list
     */
    private static void printList(Collection<? extends Person> list) {
        for (Iterator<? extends Person> iterator = list.iterator(); iterator.hasNext() ;) {
            Person person = iterator.next();
            System.out.println(person.getName());
        }
    }

}

