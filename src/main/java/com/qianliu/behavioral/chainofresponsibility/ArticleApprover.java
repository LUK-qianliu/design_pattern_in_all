package com.qianliu.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class ArticleApprover extends Approver {
    @Override
    public void check(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())){
            System.out.println("手记不为空，内容为:"+course.getArticle());

            // 责任链下一层还有校验的话，就交给下一个校验者
            if(nextApprover!=null){
                nextApprover.check(course);
            }
        }else {
            System.out.println("缺少手记，不允许发布该课程");
            return;
        }
    }
}
