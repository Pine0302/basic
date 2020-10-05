package com.company.string;

public class StringDemo {
    public static void main(String[] args) {
        String str = "abcd";
        str = "haha";
        System.out.println(str);

        //------------------
        System.out.println("----------多个引用指向同一个字符串------------");
        String s1 = "pine";
        String s2 = "pine";
        System.out.println(s1 == s2);

        System.out.println("---------两个内容相同,创建方式不同的字符串---------");

        String s3 = "abc";
        String s4 = new String("abc");

        /**
         * s3 创建,在内存中只有一个对象
         * s4 创建,在内存中有两个对象
         */
        System.out.println(s3 == s4);  //false
        //true 因为String 复写了equals方法,建立了字符串自己的判断依据,通过字符串中的内容料判断
        System.out.println(s3.equals(s4));



    }
}
