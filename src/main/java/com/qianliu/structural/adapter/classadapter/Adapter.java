package com.qianliu.structural.adapter.classadapter;

/**
 * 被适配者 适配 适配者
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
