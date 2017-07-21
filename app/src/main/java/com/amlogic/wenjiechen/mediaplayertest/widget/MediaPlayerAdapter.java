package com.amlogic.wenjiechen.mediaplayertest.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.amlogic.wenjiechen.mediaplayertest.R;
import com.amlogic.wenjiechen.mediaplayertest.bean.MediaPlayerItemBean;

import java.util.List;

/**
 * Created by Wenjie.Chen on 2017/7/21.
 */

public class MediaPlayerAdapter extends BaseAdapter {

    private static final String TAG = "MediaPlayerAdapter";
    private Context context;
    private List<MediaPlayerItemBean> mediaPlayerItemList;
    private int mIndex;

    public MediaPlayerAdapter(Context context, List<MediaPlayerItemBean> mediaPlayerItemList, int mIndex ) {
        super();
        this.context = context;
        this.mediaPlayerItemList = mediaPlayerItemList;
        this.mIndex = mIndex;
    }

    @Override
    public int getCount() {
        return mediaPlayerItemList.size();
    }

    @Override
    public MediaPlayerItemBean getItem(int i) {
        return mediaPlayerItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        MediaPlayerItemBean mediaPlayerItemBean = mediaPlayerItemList.get(i);
        if (view == null){
            holder = new ViewHolder();
            view = View.inflate(context, R.layout.mediaplayer_item, null);
            holder.surfaceView = view.findViewById(R.id.surface);
            view.setTag(holder);
            Log.i("getView", "+++++:list" + i );
        } else {
            holder = (ViewHolder)view.getTag();
        }
        return view;
    }

    static class ViewHolder{
        private SurfaceView surfaceView;
        private MediaPlayerItemBean mediaPlayerItemBean;
    }
}
