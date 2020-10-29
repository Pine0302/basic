package com.company.reflect.test;

import com.company.domain.MouseByUsb;
import com.company.domain.NoteBook;
import com.company.domain.Usb;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class NoteBookMain {
    public static void main(String[] args) throws Exception {
        NoteBook noteBook = new NoteBook();

        //从配置文件中读取设备，并运行设备
        File configureFile = new File("tempfile/usb.properties");
        if(!configureFile.exists()){
            System.out.println(configureFile.getAbsoluteFile());
            configureFile.createNewFile();
        }
        FileReader fileReader = new FileReader(configureFile);

        Properties properties = new Properties();
        properties.load(fileReader);
        noteBook.run();
        for (int i = 1; i <= properties.size() ; i++) {
            String className = properties.getProperty("usb"+i);
            Class clazz = Class.forName(className);
            Usb usb = (Usb) clazz.getDeclaredConstructor().newInstance();
            noteBook.useUsb(usb);
        }
        fileReader.close();
    }

}
