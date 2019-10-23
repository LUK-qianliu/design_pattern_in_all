package com.qianliu.structural.proxy.staticproxy;


import com.qianliu.structural.proxy.Order;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        // 静态代理增强insert方法
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
