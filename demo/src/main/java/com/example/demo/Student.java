package com.example.demo;

/**
 * @author:Administrator
 * @date:2021/1/14 0014 21:24
 */
public interface Student {

    public static final String GRIL_FRIEND = "liuyifei"; // 常量
    public abstract int fuck(); // 抽象方法
    public static void _3p (){ // 静态方法
        System.out.println("he play with two girl");
    }
    public default void with(){
        System.out.println("with liuyifei and jingtian");
    }
}
interface fly{
    int speed = 300;
    void fly();
}

