package com.company.generic;

public class GenericDemo4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new InterImpl<String>().show("hehe");
    }

}


//泛型接口。
interface Inter<E>{
    void show(E e);
}
/*
class InterImpl implements Inter<String>{
	public void show(String e){}
}
*/

class InterImpl<T> implements Inter<T>{

    @Override
    public void show(T e) {


    }

}
