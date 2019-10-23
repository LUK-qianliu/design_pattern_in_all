package com.qianliu.structural.decorator.v2;


public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);// 加鸡蛋
        aBattercake = new EggDecorator(aBattercake);// 加鸡蛋
        aBattercake = new SausageDecorator(aBattercake);// 加香肠

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());

    }
}
