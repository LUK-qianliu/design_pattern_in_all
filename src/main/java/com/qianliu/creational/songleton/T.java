package com.qianliu.creational.songleton;

/**
 * Created by geely
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();
        ThreadLocalSongleton instance = ThreadLocalSongleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+instance);


//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();;

//        ContainerSingleton.putInstance("object",new Object());
//        Object instance = ContainerSingleton.getInstance("object");
//


    }
}
