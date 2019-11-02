package com.qianliu.behavioral.state.state;

import com.qianliu.behavioral.state.VideoContext;
import com.qianliu.behavioral.state.VideoState;

public class StopState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 不能加速。。");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 不能暂停。。");
    }

    @Override
    public void stop() {
        System.out.println("停止播放。。");
    }
}
