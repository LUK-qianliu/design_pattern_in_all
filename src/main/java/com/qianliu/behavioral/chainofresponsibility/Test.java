package com.qianliu.behavioral.chainofresponsibility;

public class Test {

    public static void main(String[] args) {
        Course course = new Course();
        course.setCourseName("java 入门");
        course.setArticle("设置手记");
        //course.setVideo("设置视频");

        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();
        articleApprover.setNextApprover(videoApprover);

        articleApprover.check(course);
    }
}
