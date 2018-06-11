package com.xuke.popupwindow.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * BaseAdapter基类封装.
 */

public abstract class CYBaseAdapter<T> extends BaseAdapter {

    protected Context context;

    protected List<T> listData;

    private LayoutInflater layoutInflater;

    public CYBaseAdapter(Context context, List<T> listData) {
        this.context = context;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData == null ? 0 : listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData == null ? null : listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public List<T> getListData() {
        return listData;
    }

    public void refresh(List<T> listData) {
        this.listData=listData;
        notifyDataSetChanged();
    }

    public View inflate(int layoutId) {
        return layoutInflater.inflate(layoutId, null);
    }

}