package com.company.collection;


import java.util.LinkedList;

public class LinkedListTest {
    /**
     * 用linkedList 模拟 栈和队列
     * 创建一个堆栈或者队列的数据结构对象，该对象中，使用linkedList来完成
     * @param args
     */
    public static void main(String[] args) {
        //创建队列对象
        Queue queue = new Queue();

        //添加元素
        queue.QAdd("pine1");
        queue.QAdd("pine2");
        queue.QAdd("pine3");
        queue.QAdd("pine4");
        //取元素
        while(!queue.isNull()){
            System.out.println(queue.Qget());
        }


        //创建队列对象
        Zueue zueue = new Zueue();

        //添加元素
        zueue.ZAdd("pine1");
        zueue.ZAdd("pine2");
        zueue.ZAdd("pine3");
        zueue.ZAdd("pine4");
        //取元素
        while(!zueue.isNull()){
            System.out.println(zueue.Zget());
        }


    }
}
/**
 * 定义一个队列数据结构
 */

class Queue{
    private LinkedList link;

    public Queue() {
        link = new LinkedList();
    }

    /**
     * 队列添加元素
     * @param obj
     */
    public void QAdd(Object obj){
        link.addFirst(obj);
    }


    /**
     *  队列获取元素
     */
    public Object Qget(){
        return link.removeLast();
    }

    public boolean isNull(){
        return link.isEmpty();
    }

}


/**
 * 定义一个栈数据结构
 */

class Zueue{
    private LinkedList link;

    public Zueue() {
        link = new LinkedList();
    }

    /**
     * 队列添加元素
     * @param obj
     */
    public void ZAdd(Object obj){
        link.addFirst(obj);
    }


    /**
     *  队列获取元素
     */
    public Object Zget(){
        return link.removeFirst();
    }

    public boolean isNull(){
        return link.isEmpty();
    }

}
