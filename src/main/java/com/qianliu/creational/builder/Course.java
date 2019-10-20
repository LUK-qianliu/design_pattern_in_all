package com.qianliu.creational.builder;

import lombok.Data;

@Data
public class Course {
    private String courseName;//课程名称
    private String coursePPT;//ppt
    private String courseVideo;//video
    private String courseArticle;//文章

    //question & answer
    private String courseQA;
}
