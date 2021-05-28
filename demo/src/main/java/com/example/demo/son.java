package com.example.demo;

/**
 * @author:Administrator
 * @date:2021/2/1 0001 22:42
 */
public class son extends father {
    int a = 100;
    int b = 111;
    {
        System.out.println(a+"==="+b);
    }
    public son(){
        a = 200;
        b = 300;
        System.out.println("调用构造函数");
    }
    public void get(){
        System.out.println("b="+b);
    }
}
