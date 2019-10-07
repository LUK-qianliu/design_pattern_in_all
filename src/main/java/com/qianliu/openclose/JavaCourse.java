package com.qianliu.openclose;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class JavaCourse implements ICourse {

    private String name;
    private BigDecimal price;

    public String getCourseName() {
        return this.name;
    }

    public BigDecimal getCoursePrice() {
        return  price;
    }
}
