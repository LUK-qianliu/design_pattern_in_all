package com.qianliu.creational.songleton;

public class ThreadLocalSongleton {
    private static  final ThreadLocal<ThreadLocalSongleton> threadlocal =
            new ThreadLocal<ThreadLocalSongleton>(){
        @Override
        protected ThreadLocalSongleton initialValue() {
            return new ThreadLocalSongleton();
        }
    };

    private ThreadLocalSongleton(){

    }

    public static ThreadLocalSongleton getInstance(){
        return threadlocal.get();
    }
}
