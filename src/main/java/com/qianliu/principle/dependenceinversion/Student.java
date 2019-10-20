package com.qianliu.dependenceinversion;

public class Student {

//    public void studyJavaCourse(){
//        System.out.println("学习java");
//    }
//
//    public void studyCCourse(){
//        System.out.println("学习c");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("学习python");
//    }

//    public void studyCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }

//    ICourse iCourse;
//
//    public Student(ICourse iCourse){
//        this.iCourse = iCourse;
//    }
//
//    public void studyCourse(){
//        iCourse.studyCourse();
//    }

    ICourse iCourse;

    public ICourse getiCourse() {
        return iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }
}
