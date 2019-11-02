package com.qianliu.behavioral.mediator;

public class Test {

    public static void main(String[] args) {
        User user = new User("xiaowang");
        user.send(new Message("我想睡觉"));
    }
}
