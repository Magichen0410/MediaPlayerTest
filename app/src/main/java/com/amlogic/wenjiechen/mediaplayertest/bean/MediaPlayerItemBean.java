package com.amlogic.wenjiechen.mediaplayertest.bean;

import android.media.MediaPlayer;
import android.view.SurfaceView;

/**
 * Created by Wenjie.Chen on 2017/7/21.
 */

public class MediaPlayerItemBean {
    private SurfaceView surfaceView;
    private MediaPlayer mediaPlayer;

    public MediaPlayerItemBean(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public SurfaceView getSurfaceView() {
        return surfaceView;
    }

    public void setSurfaceView(SurfaceView surfaceView) {
        this.surfaceView = surfaceView;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
}
