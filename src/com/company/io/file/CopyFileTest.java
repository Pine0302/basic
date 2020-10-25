package com.company.io.file;

import java.io.*;

public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("tempfile/file.txt");
        File targetFile = new File("tempfile/copy_file.txt");
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(targetFile);
        int ch = 0;
        while((ch=fis.read())!=-1){
            fos.write(ch);
        }
        fis.close();
        fos.close();
    }
}
