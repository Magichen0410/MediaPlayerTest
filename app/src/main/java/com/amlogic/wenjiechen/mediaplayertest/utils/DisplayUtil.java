package com.amlogic.wenjiechen.mediaplayertest.utils;

import android.content.Context;

/**
 * Created by Wenjie.Chen on 2017/7/21.
 * dip与px之间转换。
 */

public class DisplayUtil {

    public static int dip2px(Context context, float dipValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dipValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue / scale + 0.5f);
    }
}
