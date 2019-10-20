package com.qianliu.creational.abstractfactory;


public class JavaCourseFactory implements CourseFactory {

    public Video getVideo() {
        return new JavaVideo();
    }

    public Code getCode() {
        return new JavaCode();
    }
}
