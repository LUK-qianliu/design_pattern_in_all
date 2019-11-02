package com.qianliu.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class VideoApprover extends Approver {
    @Override
    public void check(Course course) {
        if(!StringUtils.isEmpty(course.getVideo())){
            System.out.println("视频不为空，内容为:"+course.getVideo());

            // 责任链下一层还有校验的话，就交给下一个校验者
            if(nextApprover!=null){
                nextApprover.check(course);
            }
        }else {
            System.out.println("缺少视频，不允许发布该课程");
            return;
        }
    }
}
