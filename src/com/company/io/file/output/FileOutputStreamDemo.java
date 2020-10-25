package com.company.io.file.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("tempfile");
        if(!dir.exists()){
            dir.mkdir();
        }
        File file = new File(dir,"file.txt");

        FileOutputStream fos = new FileOutputStream(file);

        byte[] data = "pine".getBytes();

        fos.write(data);
        fos.close();
    }
}
