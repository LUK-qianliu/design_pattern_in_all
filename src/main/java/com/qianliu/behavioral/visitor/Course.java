package com.qianliu.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Course {
    private String courseName;// 课程名称

    public abstract void accept(IVisitor visitor); // 可以访问的人群
}
