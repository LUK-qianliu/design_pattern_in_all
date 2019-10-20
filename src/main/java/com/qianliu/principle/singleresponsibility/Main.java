package com.qianliu.principle.singleresponsibility.singleresponsibility;

public class Main {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.movemode("大雁");
//        bird.movemode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.movemode("大雁");

        WorkBird workBird = new WorkBird();
        workBird.movemode("鸵鸟");
    }
}
