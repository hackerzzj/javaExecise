package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author:Administrator
 * @date:2021/1/10 0010 23:12
 */
@Component
@ConfigurationProperties(prefix = "person2")
@PropertySource("classpath:person.properties")
public class Person {
    @Value("${person1.name}")
    private String name;
    private String sex;
    private Friend friend;
    private List<Friend> friends;
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

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", friend=" + friend +
                ", friends=" + friends +
                '}';
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }
}
