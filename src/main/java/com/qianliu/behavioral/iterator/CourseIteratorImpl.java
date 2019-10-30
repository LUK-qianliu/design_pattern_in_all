package com.qianliu.behavioral.iterator;

import java.util.List;

/**
 * 遍历课程
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;//维持课程的下标
    private Course course;

    /**
     * 传入list<Course>就可以管理课程的迭代了
     * @param courseList
     */
    public CourseIteratorImpl(List courseList){
        this.courseList=courseList;
    }


    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是: "+position);
        course=(Course)courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse(){
        if(position< courseList.size()){
            return false;
        }
        return true;
    }
}
