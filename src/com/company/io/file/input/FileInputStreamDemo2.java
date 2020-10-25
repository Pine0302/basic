package com.company.io.file.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("tempfile");
        File file = new File(dir,"file.txt");
        FileInputStream fis = new FileInputStream(file);
        int ch = 0;
        while((ch=fis.read())!=-1){
            System.out.println("ch="+(char)ch);
        }
    }

}
