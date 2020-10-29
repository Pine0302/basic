package com.company.domain;

public class NoteBook {
    /**
     * 运行方法
     */
    public void run()
    {
        System.out.println("notebook run");
    }

    public void useUsb(Usb usb){
        if(usb==null){
            System.out.println("未检测到外设");
        }else{
            usb.run();
        }

    }




}
