package com.company.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 使用List，解决，插入元素的问题。因为add方法追加。
         * List接口的特有方法，全都是围绕索引来定义的。
         *
         * List获取元素的方式有两种：一种是迭代，一种 遍历+get
         *
         * List接口是支持对元素进行curd增删改查动作的。
         *
         */
        List list = new ArrayList();

        //1,添加元素。
        list.add(new Student("wangcai1",21));
        list.add(new Student("wangcai2",22));
        list.add(new Student("wangcai3",23));

        //2,插入元素。
//		list.add(1, new Student("xiaoqiang",25));

        //3,删除元素。
//		list.remove(2);//IndexOutOfBoundsException


        //3,修改元素。
        list.set(1, new Student("xiaoming",11));

//		Object obj = list.get(1);
//		System.out.println(obj);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("get("+i+"):"+list.get(i));
        }

//		for (Iterator it = list.iterator(); it.hasNext();) {
//			Student stu = (Student) it.next();
//			System.out.println(stu);
//		}


    }
}
