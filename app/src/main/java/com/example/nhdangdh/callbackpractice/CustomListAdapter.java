package com.example.nhdangdh.callbackpractice;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nhdangdh on 7/6/2017.
 */

public class CustomListAdapter extends BaseAdapter {

    private List<Items> listData;
    private LayoutInflater layoutInflater;
    private Context context;
    Activity activity;

    public CustomListAdapter() {
    }

    public CustomListAdapter(List<Items> listData, Context context) {
        this.listData = listData;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.imgViewItem = (ImageView) convertView.findViewById(R.id.imgViewItem);
            holder.txtName = (TextView) convertView.findViewById(R.id.txtName);
            holder.txtInfo = (TextView) convertView.findViewById(R.id.txtInfo);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Items items = this.listData.get(position);
        holder.txtName.setText(items.getName());
        holder.txtInfo.setText(items.getInfo());
        holder.imgViewItem.setImageResource(items.getImage());

        holder.imgViewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomListAdapter obj = new CustomListAdapter();
                CallBack callBack = new CallBackFinishApp();
                obj.register(callBack);
            }
        });

        return convertView;
    }

    public void register(CallBack callBack){
        callBack.finishApp();
    }

    static class ViewHolder{
        ImageView imgViewItem;
        TextView txtName;
        TextView txtInfo;
    }
}
