package com.xuke.popupwindow.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.xuke.popupwindow.Entity.XEntity;
import com.xuke.popupwindow.R;

import java.util.List;

public class XAdapter extends CYBaseAdapter<XEntity> {

    public XAdapter(Context context, List<XEntity> listData) {
        super(context, listData);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflate(R.layout.item);
            holder = new ViewHolder();

            holder.className = (TextView) convertView.findViewById(R.id.tv_name);
            holder.checked = (ImageView) convertView.findViewById(R.id.iv_selected);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        XEntity entity = listData.get(position);
        String studyPath = entity.getFullName();
        holder.className.setText(studyPath);
        if (entity.isChecked()) {
            holder.checked.setVisibility(View.VISIBLE);
        } else {
            holder.checked.setVisibility(View.INVISIBLE);
        }
        return convertView;
    }

    private static class ViewHolder {
        TextView className;
        ImageView checked;
    }
}
