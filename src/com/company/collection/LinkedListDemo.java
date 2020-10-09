package com.company.collection;


import java.util.LinkedList;

public class LinkedListDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * LinkedList做个了解。
         * 特有：围绕头和尾展开定义的。First Last。
         * addFirst();
         * addLast();
         *
         * getFirst();：获取头部元素。
         * getLast();
         *
         * removeFirst();获取头部元素，并删除头部元素。
         * removeLast();
         */

        LinkedList link = new LinkedList();

        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");

//		System.out.println(link.getFirst());
//		System.out.println(link.getFirst());

//		System.out.println(link.removeFirst());
//		System.out.println(link.removeFirst());
//		System.out.println(link.removeFirst());
//		System.out.println(link.removeFirst());

        while (!link.isEmpty()) {

            System.out.println(link.removeLast());
        }


    }
}
