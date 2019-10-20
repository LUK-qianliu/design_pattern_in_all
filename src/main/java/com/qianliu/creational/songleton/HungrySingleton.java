package com.qianliu.creational.songleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable {
    private static HungrySingleton ourInstance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return ourInstance;
    }

    private HungrySingleton() {
        if(HungrySingleton.getInstance() !=null){
            throw new RuntimeException("禁止构造单例对象");
        }
    }

    public Object readResolve(){
        return ourInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return getInstance();
    }
}
