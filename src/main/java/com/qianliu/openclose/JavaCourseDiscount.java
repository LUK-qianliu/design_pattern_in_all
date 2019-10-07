package com.qianliu.openclose;

import java.math.BigDecimal;

public class JavaCourseDiscount extends JavaCourse {

    /**
     * 调用父类的构造方法
     * @param name
     * @param price
     */
    public JavaCourseDiscount(String name, BigDecimal price) {
        super(name, price);
    }

    /**
     * 给java书打八折
     * @return
     */
    public BigDecimal getDiscountPrice(){
        return this.getPrice().multiply(new BigDecimal("0.8"));
    }
}
