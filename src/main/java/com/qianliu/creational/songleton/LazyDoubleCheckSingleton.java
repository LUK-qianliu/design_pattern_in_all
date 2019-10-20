package com.qianliu.creational.songleton;

/**
 * 双重检验锁懒汉模式
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazySingleton==null){//1.第一次检查，此处是为了减少性能开销，不用每次进入synchronized中
            synchronized (LazyDoubleCheckSingleton.class) {
                if(lazySingleton==null){//2.第二次检测

                    /*问题：原来的排序过程是：1、2、3,但是可能jvm指令重排序成为1、3、2，
                    * 此时可能两个线程都在执行2，执行3的时候这两个线程都new了LazyDoubleCheckSingleton对象
                    *
                    * 解决办法：volatile
                    * */
                    //1.分配内存给这个对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.new一个LazyDoubleCheckSingleton对象
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazySingleton;
    }

}
