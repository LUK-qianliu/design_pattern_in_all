package com.qianliu.behavioral.templatemethod;


public abstract class ACourse {
    /**
     * 声明为final，不让子类修改
     */
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void writeArticle(){
        System.out.println("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle(){//可能需要为配套的课程提供手记
        return false;
    }
    abstract void packageCourse();
}
