package com.qianliu.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

public class CodingCourse extends Course {
    @Getter @Setter
    private double price;

    public CodingCourse(String courseName,int price) {
        super(courseName);
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
