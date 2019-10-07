package com.qianliu.openclose;


import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) {
//        ICourse iCourse = new JavaCourse("java从入门到放弃",new BigDecimal("18.8"));
//        System.out.println("课程:"+iCourse.getCourseName()+",价格:"+iCourse.getCoursePrice());

        //打折后
        ICourse iCourse = new JavaCourseDiscount("java从入门到放弃",new BigDecimal("18.8"));
        JavaCourseDiscount javaCourseDiscount = (JavaCourseDiscount) iCourse;//因为icourse没有getDiscountPrice方法，所以需要强制转换
        System.out.println("课程:"+javaCourseDiscount.getCourseName()+",价格:"+javaCourseDiscount.getDiscountPrice());
    }
}
