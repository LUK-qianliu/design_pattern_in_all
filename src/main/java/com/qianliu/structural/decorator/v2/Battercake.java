package com.qianliu.structural.decorator.v2;

/**
 * 具体的煎饼
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
