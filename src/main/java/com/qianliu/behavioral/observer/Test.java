package com.qianliu.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("java入门");
        Teacher teacher = new Teacher("Mr.Li");

        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("小王");
        question.setQustionContent("java如何让防止xss攻击？");
        course.produceQuestion(course,question );
    }
}
