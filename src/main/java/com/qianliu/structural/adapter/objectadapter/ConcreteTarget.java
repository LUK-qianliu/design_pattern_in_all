package com.qianliu.structural.adapter.objectadapter;


/**
 * 适配者的实现
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
