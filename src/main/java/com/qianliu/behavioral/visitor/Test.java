package com.qianliu.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();

        courses.add(new FreeCourse("java入门"));

        courses.add(new CodingCourse("java实战",100));

        for (Course course: courses) {
            course.accept(new Visitor());//访问者模式的核心：相同访问者产生不一样的结果
        }
    }
}
