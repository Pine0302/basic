package com.company.string.StringBuffer;

public class StringBufferTest {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * int[] arr = {34,12,89,68};
         * 将一个int[]中元素转成字符串  格式 [34,12,89,68]
         */
        int[] arr = {34,12,89,68};
        String str = toString_2(arr);
        System.out.println(str);
    }

    /**
     * 缓冲区的应用：无论多少数据，什么类型都不重要，只要最终变成字符串就可以StringBuffer这个容器。
     * @param arr
     * @return
     */
    public static String toString_2(int[] arr) {
        //1,创建缓冲区。
        StringBuffer sb = new StringBuffer();

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                sb.append(arr[i]+",");
            }else{
                sb.append(arr[i]+"]");
            }
        }


        return sb.toString();
    }

    public static String toString(int[] arr) {

        //用字符串连接。
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                str+=arr[i]+",";
            }else{
                str+=arr[i]+"]";
            }
        }
        return str;
    }
}
