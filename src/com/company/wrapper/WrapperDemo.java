package com.company.wrapper;

public class WrapperDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 场景：通过文本框获取用户输入的数字数据，可是得到的都是字符串。 如果想要对字符串中的数字进行运算，必须要将字符串转成数字。
         * Java中提供了相应的解决的对象。 基本数据类型对象包装类：java将基本数据类型值封装成了对象。
         * 封装成对象有什么好处？因为可以提供更多的操作基本数值的功能。 byte Byte short Short int Integer long
         * Long float Float double Double boolean Boolean char Character
         */

        // 学习一下Integer。
        /*
         * 基本数据类型对象包装类特点： 1，用于在基本数据和字符串之间进行转换。★★★★ int parseInt(string); byte
         * parseByte(string); boolean parseBoolean(string); xxx
         * parseXxx(string); 只有Character没有解析方法。
         */

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.toBinaryString(-6));//将十进制转成二进制或
        // System.out.println(Integer.toHexString(-6));//将十进制转成十六进制或
        // System.out.println(Integer.toOctalString(-6));//将十进制转成八进制或

        // 1，字符串--->基本数值。 基本数值 (字符串);演示Integer int (string);
        System.out.println(Integer.parseInt("123") + 2);// NumberFormatException:
        System.out.println(Integer.parseInt("a1", 16));// 可以将其他进制转成十进制。
        // 2，基本数值---->字符串呢？34+"" String.valueOf(34); Integer.toString(int);
        System.out.println(34 + 5);

        // 3,基本数值---->包装对象
        Integer iq = new Integer(4);
        Integer ii = new Integer("4");
        Integer iii = Integer.valueOf(4);

        // 包装对象---->基本数值
        int num = iq.intValue();



//		int i = 4;
//		Integer i = new Integer(4);
//		JDK1.5以后，有了一个包装类的新特性。目的简化书写，自动装箱，
        Integer i = 4;//自动装箱。Integer i = Integer.valueOf(4);
        i = i + 5;//原理;等号右边：将i对象转成基本数值   i.intValue() + 5;//自动拆箱。加法运算后，再次装箱。
        //i = Integer.valueOf(i.intValue()+5);



        Integer a = new Integer(3);
        Integer b = new Integer(3);
        System.out.println(a==b);//false
        System.out.println(a.equals(b));//true

        System.out.println("---------------------");
        Integer x = 128;
        Integer y = 128;
        //在jdk1.5自动装箱时，如果数值在byte范围之内，不会新创建对象空间而是使用原来已有的空间。
        System.out.println(x==y);
        System.out.println(x.equals(y));

    }
}
