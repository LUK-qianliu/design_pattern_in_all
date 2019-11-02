package com.qianliu.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OpenCourseVideoCmd implements Command {

    private CourseVideo courseVideo;

    @Override
    public void exec() {
        courseVideo.open();
    }
}
