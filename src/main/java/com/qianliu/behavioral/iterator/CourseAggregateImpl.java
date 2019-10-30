package com.qianliu.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 存储课程和遍历课程的实现类
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;//存放在一个list中

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
