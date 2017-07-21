package com.amlogic.wenjiechen.mediaplayertest;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends Activity {
    private Button bplay,bpause,bstop;
    private SurfaceView surfaceView;
    private SurfaceHolder holder;
    private MediaPlayer mp = new MediaPlayer();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bplay = (Button)findViewById(R.id.play);
        bpause = (Button)findViewById(R.id.pause);
        bstop = (Button)findViewById(R.id.stop);
        surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
        holder=surfaceView.getHolder();
        holder.addCallback(new MyCallBack());
        try {
            mp.setDataSource("/storage/external_storage/sda1/test.ts");
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        bpause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(mp != null){
                    mp.pause();
                }
            }
        });

        bstop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(mp != null){
                    mp.stop();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        if(mp != null)
            mp.release();
        super.onDestroy();
    }

    private class MyCallBack implements SurfaceHolder.Callback {
        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            mp.setDisplay(holder);
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {

        }
    }
}
