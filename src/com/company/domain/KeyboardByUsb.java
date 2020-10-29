package com.company.domain;

public class KeyboardByUsb implements Usb {
    @Override
    public void run() {
        open();
        System.out.println("keyboard run");
        close();
    }

    @Override
    public void open() {
        System.out.println("keyboard open");
    }

    @Override
    public void close() {
        System.out.println("keyboard close");
    }
}
