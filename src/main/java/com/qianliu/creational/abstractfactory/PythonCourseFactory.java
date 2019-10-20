package com.qianliu.creational.abstractfactory;

public class PythonCourseFactory implements CourseFactory{
    public Video getVideo() {
        return new PythonVideo();
    }

    public Code getCode() {
        return new PyhonCode();
    }
}
