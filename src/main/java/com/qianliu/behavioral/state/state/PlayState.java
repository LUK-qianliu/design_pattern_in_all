package com.qianliu.behavioral.state.state;

import com.qianliu.behavioral.state.VideoContext;
import com.qianliu.behavioral.state.VideoState;

public class PlayState extends VideoState {

    @Override
    public void play() {
        System.out.println("播放。。");
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
