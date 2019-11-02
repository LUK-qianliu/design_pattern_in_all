package com.qianliu.behavioral.state;

import lombok.Getter;
import lombok.Setter;

public abstract class VideoState {
    @Getter @Setter
    protected VideoContext videoContext;//子类调用videoContext实现不同

    public abstract void play();// 播放视频
    public abstract void speed();// 快进视频
    public abstract void pause();// 暂停视频
    public abstract void stop();// 停止视频
}
