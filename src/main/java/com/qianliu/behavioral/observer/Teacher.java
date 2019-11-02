package com.qianliu.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
@AllArgsConstructor
public class Teacher implements Observer {

    private String teacherName;

    /**
     * 
     * @param o 观察者对象
     * @param arg 传入的参数
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(this.teacherName+" 接受到 "+
                question.getUserName()+
                " 在 "+course.getCourseName()+
                " 下提出的问题："+question.getQustionContent());
    }
}
