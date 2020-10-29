package com.company.domain;

public class MouseByUsb implements Usb {
    @Override
    public void run() {
        open();
        System.out.println("mouse run");
        close();
    }

    @Override
    public void open() {
        System.out.println("mouse open");
    }

    @Override
    public void close() {
        System.out.println("mouse close");
    }
}
