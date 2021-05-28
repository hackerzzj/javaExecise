package com.example.demo;

/**
 * @author:Administrator
 * @date:2021/1/26 0026 15:56
 */
public class LapTop  {
    public void run(){
        System.out.println("笔记本运行");
    }
    public void shutdown(){
        System.out.println("笔记本关闭");
    }
    public void useUsb(Usb usb){
        if (usb!=null){
            usb.open();
            if (usb instanceof mouse){
                mouse m = (mouse) usb;
                m.click();
            } else if(usb instanceof keyBoard){
                keyBoard k = (keyBoard) usb;
                k.print();
            }
            usb.close();
        }
    }
}
