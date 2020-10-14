package com.company.generic;

public class GenericDemo3 {

    /**
     * @param args
     */
    public static void main(String[] args) {


        Util<String> util = new Util<String>();
        util.show("hehe");
//		util.print(5);
        Util<Integer> util2 = new Util<Integer>();
        Util.print(5);
        util2.show("hehe");

    }
}

class Util<W>{
    //当方法要操作的类型不确定和类上的泛型不一定一样。这时可以将泛型定义在方法上。
    public  <Q> void show(Q q){//泛型方法
        System.out.println("show:"+q);
    }
    public static<E> void print(E e){//记住：如果方法是静态，还需要使用泛型，那么泛型必须定义在方法上。
        System.out.println("print:"+e);
    }
    public void method(W w){

    }
}