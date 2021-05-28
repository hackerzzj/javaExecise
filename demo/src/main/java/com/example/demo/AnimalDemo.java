package com.example.demo;

/**
 * @author:Administrator
 * @date:2021/1/14 0014 17:55
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
    }
}
 abstract class Animal{
    private String name;
//    public abstract void eat();
//    public abstract void sleep();
    public Animal(){
        System.out.println("生成一个动物");
    }
}

class Dog extends Animal{
//    @Override
//    public void eat() {
//        System.out.println("狗吃东西");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("狗睡觉");
//    }

    public Dog(){
        System.out.println("生成一条狗");
    }
}