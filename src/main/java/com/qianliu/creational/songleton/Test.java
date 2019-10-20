package com.qianliu.creational.songleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println("main thread"+ThreadLocalSongleton.getInstance());
        System.out.println("main thread"+ThreadLocalSongleton.getInstance());
        System.out.println("main thread"+ThreadLocalSongleton.getInstance());
        System.out.println("main thread"+ThreadLocalSongleton.getInstance());
        System.out.println("main thread"+ThreadLocalSongleton.getInstance());
        System.out.println("main thread"+ThreadLocalSongleton.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");


        //序列化攻击
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newinstance = (HungrySingleton) ois.readObject();
//        System.out.println(instance == newinstance);


        // 反射攻击：通过修改私有构造器的权限去new一个新的单例对象
//        Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);//修改私有构造函数的权限
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();
//        System.out.println(instance == newInstance);

        // 懒汉式无法解决反射攻击
//        Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazySingleton newInstance = constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
//        System.out.println(newInstance==instance);

        // 序列化无法攻击的枚举类型
//        EnumInstance instance = EnumInstance.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newinstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData() == newinstance.getData());

        // 反射枚举类型
//        EnumInstance instance = EnumInstance.getInstance();
//        Constructor<EnumInstance> declaredConstructor =
//                EnumInstance.class.getDeclaredConstructor(String.class,int.class);
//        declaredConstructor.setAccessible(true);
//        EnumInstance newInstance = declaredConstructor.newInstance("test",233);
//
//        System.out.println(instance==newInstance);
    }
}
