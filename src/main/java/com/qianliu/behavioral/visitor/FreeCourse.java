package com.qianliu.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class FreeCourse extends Course {

    public FreeCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
