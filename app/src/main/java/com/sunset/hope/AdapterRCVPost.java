package com.sunset.hope;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AdapterRCVPost extends RecyclerView.Adapter<AdapterRCVPost.RecyclerViewHolder> {


    public AdapterRCVPost(List<Integer> data) {
//        if (data == null) {
//            this.data = new ArrayList<>();
//            return;
//        }
//        this.data = data;
    }

    public void setData(List<Integer> newData) {
//        if (newData == null)
//            return;
//        this.data = newData;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.post_layout, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
//        if (data == null)
//            return;
        holder.textViewUserName.setText("Bệnh viện quận 10");
        holder.textViewDay.setText("04/02/97");
//        holder.imageViewWeatherStatus.setBackgroundResource();
        holder.textViewTime.setText("7:00 AM");
        holder.textViewSumarize.setText("This is just a small sumarize");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textViewUserName, textViewDay, textViewTime, textViewSumarize;
        ImageView imageViewWeatherStatus;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            textViewUserName = itemView.findViewById(R.id.textViewUserName);
            textViewDay = itemView.findViewById(R.id.textViewDate);
            textViewTime = itemView.findViewById(R.id.textViewTime);
            textViewSumarize = itemView.findViewById(R.id.textViewSumarize);

        }
    }

}