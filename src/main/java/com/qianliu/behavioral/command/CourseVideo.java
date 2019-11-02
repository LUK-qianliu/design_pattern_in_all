package com.qianliu.behavioral.command;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseVideo {
    private String courseName;

    public void open(){
        System.out.println("打开 "+courseName+" 视频");
    }

    public void close(){
        System.out.println("关闭 "+courseName+" 视频");
    }

}
