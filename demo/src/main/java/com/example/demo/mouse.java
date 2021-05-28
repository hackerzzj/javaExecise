package com.example.demo;

/**
 * @author:Administrator
 * @date:2021/1/26 0026 15:51
 */
public class mouse implements Usb {
    public static void main(String[] args) {
        mouse mouse = new mouse();

    }

    mouse() {
        System.out.println(i + str);
        System.out.println("wucangouzaohanshu");
    }

    int i = 10;
    String str = "111";

    {
        System.out.println("类中代码执行" + i + str);
    }

    @Override
    public void open() {
        System.out.println("鼠标链接");
    }

    @Override
    public void close() {
        System.out.println("鼠标断开链接");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
