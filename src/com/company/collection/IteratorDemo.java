package com.company.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        /*
         * 集合的取出方式。
         *
         * 迭代器是Collection集合中通用的取出方式。
         *
         */
        //1，创建集合对象。
        Collection coll = new ArrayList();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");

		/*//2.获取容器的迭代器对象。通过iterator方法。
		Iterator it = coll.iterator();

		//3,使用具体的迭代器对象获取集合中的元素。参阅迭代器的方法
		while(it.hasNext()){
			System.out.println(it.next());
		}*/

        for (Iterator it = coll.iterator(); it.hasNext();) {
            System.out.println(it.next().toString());
        }


//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//java.util.NoSuchElementException没有这个元素异常。

    }
}
