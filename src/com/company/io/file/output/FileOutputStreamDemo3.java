package com.company.io.file.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
    private static final Object LINE_SEPARATOR = System.lineSeparator();

    public static void main(String[] args) {
        File dir = new File("k://tempfile");
        File file = new File(dir,"file.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file,true);
            String str =  LINE_SEPARATOR+"pine";
            byte[] data =str.getBytes();
            fos.write(data);
        }catch (IOException e){
            System.out.println("----"+e.toString()+"--------");
        }finally {
            try {
                if(fos!=null){
                    fos.close();
                }
            }catch (IOException e){
                throw new RuntimeException("");
            }

        }

    }
}
