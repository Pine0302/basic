package com.company.io.file.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("tempfile");
        File file = new File(dir,"file.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] buf = new byte[4];
        int len = 0;
        while((len=fis.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
    }

}
