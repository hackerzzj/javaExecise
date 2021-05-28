package com.example.demo;

/**
 * @author:Administrator
 * @date:2021/1/10 0010 23:19
 */
public class Friend {
    private String name;
    private String sex;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
