package com.company.io.file.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    private static final Object LINE_SEPARATOR = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        File dir = new File("tempfile");
        if(!dir.exists()){
            dir.mkdir();
        }
        File file = new File(dir,"file.txt");

        FileOutputStream fos = new FileOutputStream(file,true);

        String str =  LINE_SEPARATOR+"pine";
        byte[] data =str.getBytes();

        fos.write(data);
        fos.write(data);
        fos.write(data);
        fos.close();
    }
}
