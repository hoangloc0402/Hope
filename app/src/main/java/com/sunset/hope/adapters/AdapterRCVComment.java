package com.sunset.hope.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sunset.hope.entities.Comment;
import com.sunset.hope.R;
import com.sunset.hope.entities.User;
import com.sunset.hope.helpers.HelperFunctions;

import java.util.ArrayList;
import java.util.List;

public class AdapterRCVComment extends RecyclerView.Adapter<AdapterRCVComment.RecyclerViewHolder> {

    private ItemClickListener itemClickListener;
    List<Comment> data;

    public AdapterRCVComment(List<Comment> data) {
        if (data == null) {
            this.data = new ArrayList<>();
        }
        this.data = data;
    }

    public void setData(List<Comment> newData) {
        if (newData == null)
            return;
        this.data = newData;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.comment_layout, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        if (data == null)
            return;
        Comment comment = data.get(position);
        User user = HelperFunctions.findUserById(comment.getOwnerId());
        holder.tvName.setText(user.getFullName());
        holder.tvDate.setText(String.valueOf(comment.getTime()));
        holder.tvContent.setText(comment.getContent());
        holder.img_avatar.setImageResource(user.getAvatarResource());

        holder.itemView.setOnClickListener(v -> {
            if (itemClickListener != null)
                itemClickListener.onClick(holder.itemView, position);
        });

    }

    @Override
    public int getItemCount() {
        if (data == null) return 0;
        return data.size();
    }


    class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvContent, tvDate;
        ImageView img_avatar;

        public RecyclerViewHolder(View view) {
            super(view);
            tvName = view.findViewById(R.id.tv_comment_name);
            tvContent = view.findViewById(R.id.tv_comment_content);
            tvDate = view.findViewById(R.id.tv_comment_date);
            img_avatar = view.findViewById(R.id.imv_comment_image);

        }

    }
    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onClick(View view, Integer position);
    }
}