package com.qianliu.behavioral.state;

import com.qianliu.behavioral.state.state.PauseState;
import com.qianliu.behavioral.state.state.PlayState;
import com.qianliu.behavioral.state.state.SpeedState;
import com.qianliu.behavioral.state.state.StopState;
import lombok.Getter;

public class VideoContext {

    @Getter
    private VideoState videoState;//管理当前video是哪一种状态

    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static StopState STOP_STATE = new StopState();

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setVideoContext(this);
    }

    public void play(){
        this.videoState.play();
    }

    public void stop(){
        this.videoState.stop();
    }

    public void pause(){
        this.videoState.pause();
    }

    public void speed(){
        this.videoState.speed();
    }

}
