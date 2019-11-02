package com.qianliu.behavioral.state.state;


import com.qianliu.behavioral.state.VideoContext;
import com.qianliu.behavioral.state.VideoState;

public class PauseState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停。。");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
