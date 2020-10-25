package com.company.io.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    //	private static final String FILE_SEPARATOR = System.getProperty("file.separator");

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        /*
         * File类的构造函数。
         * 如何创建文件对象。
         */
       // String pathName = "e:\\java_code\\day22e\\hello.java";
        String pathName = "/Volumes/Work/java_project/basic/src/com/company/api/date";
        File f1 = new File(pathName);//将Test22文件封装成File对象。注意；有可以封装不存在文件或者文件夹，变成对象。
        System.out.println(f1);


      //  File f2 = new File("e:\\java_code\\day22e","hello.java");
        File f2 = new File("/Volumes/Work/java_project/basic/src/com/company/api/date","hello.java");
        System.out.println(f2);

        //将parent封装成file对象。
        File dir = new File("/Volumes/Work/java_project/basic/src/com/company/api/date");
        File f3 = new File(dir,"hello.java");
        System.out.println(f3);
        boolean t3 = f3.createNewFile();
        System.out.println(t3);
        f3.delete();


//		File f4 = new File("e:"+FILE_SEPARATOR+"java_code"+FILE_SEPARATOR+"day22e"+FILE_SEPARATOR+"hello.java");
        File f5 = new File("e:"+File.separator+"java_code"+File.separator+"day22e"+File.separator+"hello.java");


    }
}
