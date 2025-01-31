package com.qianliu.behavioral.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程:"+freeCourse.getCourseName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程:"+codingCourse.getCourseName()+",课程价格:"+codingCourse.getPrice());
    }
}
