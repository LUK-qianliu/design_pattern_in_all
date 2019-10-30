package com.qianliu.behavioral.iterator;

/**
 * 迭代器：遍历课程
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();

}
