package com.qianliu.dependenceinversion;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.studyCCourse();
//        student.studyJavaCourse();
//        student.studyPythonCourse();

//        Student student = new Student();
//        student.studyCourse(new JavaCourse());
//        student.studyCourse(new PythonCourse());
//        student.studyCourse(new CCourse());

//        Student student = new Student(new JavaCourse());
//        student.studyCourse();

        Student student = new Student();
        student.setiCourse(new JavaCourse());
        student.studyCourse();
    }
}
