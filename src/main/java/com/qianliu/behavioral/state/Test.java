package com.qianliu.behavioral.state;

import com.qianliu.behavioral.state.state.PauseState;
import com.qianliu.behavioral.state.state.PlayState;
import com.qianliu.behavioral.state.state.StopState;

public class Test {

    public static void main(String[] args) {
        VideoContext videoContext = new VideoContext();
        // 播放状态
        videoContext.setVideoState(new PlayState());
        System.out.println("当前状态:"+videoContext.getVideoState().getClass().getSimpleName());// 获取调用的类的类名

        // 停止状态
        videoContext.stop();
        System.out.println("当前状态:"+videoContext.getVideoState().getClass().getSimpleName());


        // 设为暂停状态
        videoContext.pause();
        System.out.println("当前状态:"+videoContext.getVideoState().getClass().getSimpleName());

    }
}
