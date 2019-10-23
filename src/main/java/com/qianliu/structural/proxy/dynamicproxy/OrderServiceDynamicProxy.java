package com.qianliu.structural.proxy.dynamicproxy;


import com.qianliu.structural.proxy.Order;
import com.qianliu.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    // 传入需要代理的类
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 增强insert方法
     * @return
     */
    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);//传入类加载器，接口，类本身
    }




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);

        Object object = method.invoke(target,args);// 通过Method.invoke来调用反射对象的方法，args是方法参数

        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before code");
        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
