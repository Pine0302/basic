package com.company.generic;


import com.company.domain.Person;
import com.company.domain.Student;
import com.company.domain.Worker;

import java.util.*;


public class GenericDemo9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         *  泛型的限定在api中的使用。下限的体现。
         *  TreeSet(Comparator<? super E> comparator)
         *
         *
         */
        //创建一个集合存储的是学生对象。想要按照姓名排序。
        TreeSet<Student> ts = new TreeSet<Student>(new ComparatorByName());
        ts.add(new Student("abc",26));
        ts.add(new Student("aaa",29));
        ts.add(new Student("lisi",20));


        for (Iterator<Student> it = ts.iterator(); it.hasNext();) {
            Student student =  it.next();
            System.out.println(student);

        }

        //让工人按照姓名排序。
        TreeSet<Worker> ts2 = new TreeSet<Worker>(new ComparatorByName());
        ts2.add(new Worker("abc",26));
        ts2.add(new Worker("aaa",29));
        ts2.add(new Worker("lisi",20));


        for (Iterator<Worker> it = ts2.iterator(); it.hasNext();) {
            Worker worker =  it.next();
            System.out.println(worker);

        }
    }
}


class ComparatorByName implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        int temp = o1.getName().compareTo(o2.getName());

        return temp==0? o1.getAge() - o2.getAge() : temp;
    }

}
/*
 * 以下两个比较器，都是通过姓名排序，就是类型不同，一个是student，一个是worker
 * 既然使用的都是Person的内容，为什么不定义一个Person的比较器。
 */
/*
//定义一个比较器。
class ComparatorByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int temp = o1.getName().compareTo(o2.getName());

		return temp==0? o1.getAge() - o2.getAge() : temp;
	}

}
//定义一个工人的姓名比较器。
class ComparatorByWorkerName implements Comparator<Worker>{

	@Override
	public int compare(Worker o1, Worker o2) {
		int temp = o1.getName().compareTo(o2.getName());

		return temp==0? o1.getAge() - o2.getAge() : temp;
	}

}
*/
/*
 * class TreeSet<E>{
 * 		TreeSet(Comparator<? super E>  c){}
 */







