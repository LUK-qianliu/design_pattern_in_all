package com.qianliu.creational.abstractfactory;


/**
 * 一个课程需要有学习视频和代码
 */
public interface CourseFactory {
    Video getVideo();
    Code getCode();
}
