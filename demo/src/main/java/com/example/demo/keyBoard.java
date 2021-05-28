package com.example.demo;

/**
 * @author:Administrator
 * @date:2021/1/26 0026 15:53
 */
public class keyBoard implements Usb{
    @Override
    public void open() {
        System.out.println("键盘链接");
    }

    @Override
    public void close() {
        System.out.println("键盘断开链接");
    }
    public void print(){
        System.out.println("键盘进行打印");
    }
}
