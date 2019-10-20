package com.qianliu.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Code code = courseFactory.getCode();
        Video video = courseFactory.getVideo();

        code.produce();
        video.produce();
    }
}
