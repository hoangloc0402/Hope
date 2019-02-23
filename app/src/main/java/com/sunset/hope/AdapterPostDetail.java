package com.sunset.hope;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterPostDetail extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<Comment> commentList;

    public AdapterPostDetail(Context context, int layout, ArrayList<Comment> commentList) {
        this.context = context;
        this.layout = layout;
        this.commentList = commentList;
    }

    @Override
    public int getCount() {
        return commentList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);

        TextView tvName = convertView.findViewById(R.id.tv_comment_name);
        tvName.setText(commentList.get(position).getOwnerId());
        TextView tvContent = convertView.findViewById(R.id.tv_comment_content);
        tvContent.setText(commentList.get(position).getContent());

        return convertView;
    }
}
