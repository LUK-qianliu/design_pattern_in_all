package com.qianliu.structural.facade;

/**
 * 物流系统模块
 */
public class ShippingService {
    public String shipGift(PointGift pointGift){
        //物流系统的对接逻辑
        System.out.println(pointGift.getName()+"进入物流系统");
        String shippingOrderNo = "666"; //生成订单号
        return shippingOrderNo;
    }
}
