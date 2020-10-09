package com.company.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection coll1 = new ArrayList();
        Collection coll2 = new ArrayList();
      //  collectionDemo(coll1);
        collectionDemo2(coll1,coll2);
    }

    public static void collectionDemo(Collection coll){
        //1.往集合中添加对象元素 add(Object);
        coll.add("pine1");
        coll.add("pine2");
        coll.add("pine3");
        //2.删除
        coll.remove("pine2");
        //3.判断是否包含
        System.out.println(coll.contains("pine1"));
        //4.清除集合
        coll.clear();

        System.out.println(coll.size());
        System.out.println(coll); //[pine1, pine2, pine3]
    }

    public static void collectionDemo2(Collection c1,Collection c2){
        //1.往集合中添加对象元素 add(Object);
        c1.add("pine1");
        c1.add("pine2");
        c1.add("pine3");

        c2.add("pp1");
        c2.add("pp2");
        c2.add("pp3");
        //添加所有c1元素到c2中
        c2.addAll(c1);
        System.out.println(c2);

        boolean b = c2.containsAll(c1);
        System.out.println("b="+b);

        //c2中删除所有和c1相同的元素
        /*c2.removeAll(c1);
        System.out.println(c2);*/

        //c2中保留和c1相同的元素
        c2.retainAll(c1);
        System.out.println(c2);



    }



}
