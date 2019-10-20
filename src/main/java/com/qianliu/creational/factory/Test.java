package com.qianliu.creational.factory;


public class Test {
    public static void main(String[] args) {

        VideoFactory videoFactory = new JavaVideoFactory();//每一种video都需要创建一个factory
        Video video = videoFactory.getVideo();
        if(video == null){
            return;
        }
        video.produce();
    }

}
