package com.qianliu.creational.factory;


public class JavaVideoFactory extends VideoFactory {

    public Video getVideo() {
        return new JavaVideo();
    }
}
