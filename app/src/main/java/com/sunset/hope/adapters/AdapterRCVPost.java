package com.sunset.hope.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sunset.hope.entities.Post;
import com.sunset.hope.helpers.PostDataRandomizer;
import com.sunset.hope.R;
import com.sunset.hope.entities.Types;

import java.util.ArrayList;
import java.util.List;

public class AdapterRCVPost extends RecyclerView.Adapter<AdapterRCVPost.RecyclerViewHolder> {

    private ItemClickListener itemClickListener;
    List<Post> data = new ArrayList<>();

    public AdapterRCVPost(List<Post> data) {
        if (data == null) {
            this.data = new ArrayList<>();
            return;
        }
        this.data = data;
    }

    public  AdapterRCVPost(Boolean isDonate){
        PostDataRandomizer randomizer = new PostDataRandomizer();
        for (int i=0; i<10; i++){
            data.add(randomizer.getPost());
        }
    }

    public void setData(List<Post> newData) {
        if (newData == null)
            return;
        this.data = newData;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.post_layout, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        if (data == null)
            return;
        Post post = data.get(position);
        holder.textViewUserName.setText(post.user.getFullName());
        holder.textViewDay.setText("04/02/97");
//        holder.imageViewWeatherStatus.setBackgroundResource();
        holder.textViewTime.setText("7:00 AM");
        holder.textViewSummarize.setText(post.title);
        for (int i = 1; i< Types.getTypeList().getIcon().length; i++){
            if (post.type ==  Types.getTypeList().getText()[i]){
                holder.imageViewType.setImageResource(Types.getTypeList().getIcon()[i]);
                break;
            }
        }
        if (!post.isVerified)
            holder.imageViewVerified.setVisibility(View.INVISIBLE);

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


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textViewUserName, textViewDay, textViewTime, textViewSummarize;
        ImageView imageViewType, imageViewVerified;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            textViewUserName = itemView.findViewById(R.id.textViewUserName);
            textViewDay = itemView.findViewById(R.id.textViewDate);
            textViewTime = itemView.findViewById(R.id.textViewTime);
            textViewSummarize = itemView.findViewById(R.id.textViewSumarize);
            imageViewType = itemView.findViewById(R.id.imageViewtype);
            imageViewVerified = itemView.findViewById(R.id.imageViewVerified);
        }
    }
    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onClick(View view, Integer position);
    }
}