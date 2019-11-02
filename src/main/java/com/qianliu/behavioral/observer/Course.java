package com.qianliu.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;

@Data
@AllArgsConstructor
public class Course  extends Observable {

    private String courseName;

    /**
     *
     * @param course 观察的对象
     * @param question 传入的参数
     */
    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+
                " 在 "+course.courseName+
                " 下提出问题： "+question.getQustionContent());
        setChanged();// 设置事情发生改变
        notifyObservers(question);// 通知观察者,question作为参数传入给update(Observable o, Object arg)中的agrs使用
    }
}
