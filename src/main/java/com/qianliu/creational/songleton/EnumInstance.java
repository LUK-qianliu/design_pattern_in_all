package com.qianliu.creational.songleton;

public enum  EnumInstance {
    INSTANCE{
        public void print(){
            System.out.println("test");
        }
    };

    public abstract void print(); //外部声明这个方法，才可以使用它

    public static EnumInstance getInstance(){
        return INSTANCE;
    }


    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
