package com.qianliu.behavioral.command;

public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java入门");

        OpenCourseVideoCmd openCourseVideoCmd = new OpenCourseVideoCmd(courseVideo);
        CloseCourseVideoCmd closeCourseVideoCmd = new CloseCourseVideoCmd(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCmd);
        staff.addCommand(closeCourseVideoCmd);

        staff.execAll();
    }
}
