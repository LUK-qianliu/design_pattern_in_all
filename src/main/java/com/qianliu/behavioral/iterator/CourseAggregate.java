package com.qianliu.behavioral.iterator;

/**
 * 存放课程 + 遍历课程
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();

}
