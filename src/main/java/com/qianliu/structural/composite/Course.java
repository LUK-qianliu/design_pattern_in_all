package com.qianliu.structural.composite;

/**
 * 课程
 */
public class Course extends CatalogComponent {
    private String name; //课程名称
    private double price; //价格

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:"+name+" Price:"+price);
    }

}
