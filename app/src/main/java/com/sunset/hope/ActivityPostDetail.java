package com.sunset.hope;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class ActivityPostDetail extends AppCompatActivity {

    RecyclerView rvComment;
    ArrayList<Comment> commentList;
    AdapterRCVComment adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        rvComment = findViewById(R.id.lv_post_comment);

        commentList = new ArrayList<>();

        for(int i=0;i<50;i++){
            commentList.add(new Comment(i+"", "comment "+ i,
                    "Hello User Number "+ i, "owner "+i, new Date().getTime()));
        }

        adapter = new AdapterRCVComment(commentList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvComment.setAdapter(adapter);
        rvComment.setLayoutManager(llm);
    }


}
