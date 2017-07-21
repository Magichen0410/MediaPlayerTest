package com.amlogic.wenjiechen.mediaplayertest.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import com.amlogic.wenjiechen.mediaplayertest.R;
import com.amlogic.wenjiechen.mediaplayertest.bean.MediaPlayerItemBean;

import java.util.List;

public class MediaPlayerTest extends AppCompatActivity {

    private static final String TAG = "MediaPlayerTest";
    List<MediaPlayerItemBean> mediaPlayerItemBeans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player_test);
        displaydpi();
    }

    private void displaydpi(){
        String str = "";
        DisplayMetrics dm = new DisplayMetrics();
        dm = this.getApplicationContext().getResources().getDisplayMetrics();
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;
        float density = dm.density;
        str += "屏幕分辨率为:" + dm.widthPixels + " * " + dm.heightPixels + "\n";
        str += "绝对宽度:" + String.valueOf(screenWidth) + "pixels\n";
        str += "绝对高度:" + String.valueOf(screenHeight)
                + "pixels\n";
        str += "逻辑密度:" + String.valueOf(density)
                + "\n";
        str += "屏幕长 :" + String.valueOf(dm.widthPixels/density) + "dp\n";
        str += "屏幕款:" + String.valueOf(dm.heightPixels/density) + "dp\n";
        Log.i(TAG, "displaydpi: " + str);
    }

    private void loadData() {
        mediaPlayerItemBeans.add();
        mediaPlayerItemBeans.add();

    }
}
