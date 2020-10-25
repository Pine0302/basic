package com.company.io.file;

import com.company.io.filter.FileFilterByDir;
import com.company.io.filter.FileNameFilterByJava;
import com.company.io.filter.FileNameFilterBySuffix;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileMethodDemo4 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //需求：对给定的目录获取内部的内容。
        File dir = new File("/Volumes/Work/java_project/basic/src/com/company/");
        //健壮性判断。1，必须是存在的，2，必须是目录。否则容易引发返回数组为null，出现NullPointerException
        String[] names = dir.list();//获取的是目录下的当前的文件以及文件夹的名称。
//		System.out.println(names);
        for(String name : names){
//			System.out.println(name);
        }

        FilenameFilter filenameFilter = new FileNameFilterByJava();
        File[] files = dir.listFiles(filenameFilter);//获取目录下当前文件以及文件对象。  多态噢
        for(File file : files){
            System.out.println(file.getName());
        }

        FilenameFilter filenameFilterSuffix = new FileNameFilterBySuffix(".java");
        File[] filesSuffix = dir.listFiles(filenameFilterSuffix);//获取目录下当前文件以及文件对象。  多态噢
        for(File file : filesSuffix){
            System.out.println(file.getName());
        }

        FileFilter fileFilter = new FileFilterByDir();
        File[] filesDir = dir.listFiles(fileFilter);//获取目录下当前文件以及文件对象。  多态噢
        for(File file : filesDir){
            System.out.println(file.getName());
        }
    }
}
