package com.qianliu.creational.songleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器实现单例：无法防止序列化
 */
public class ContainerSongleton {

    //私有构造器
    private ContainerSongleton(){

    }

    private static final Map<String,Object> map = new ConcurrentHashMap<>();

    public static void putInstance(String key,Object instance){
        if(StringUtils.isBlank(key) && instance!=null){
            if(!map.containsKey(key)){
                map.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
    }
}
