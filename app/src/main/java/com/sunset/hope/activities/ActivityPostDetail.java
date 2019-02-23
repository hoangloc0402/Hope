package com.sunset.hope.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import com.sunset.hope.adapters.AdapterRCVComment;
import com.sunset.hope.entities.Comment;
import com.sunset.hope.R;

import java.util.ArrayList;
import java.util.Date;

public class ActivityPostDetail extends AppCompatActivity {

    RecyclerView rvComment;
    ArrayList<Comment> commentList;
    AdapterRCVComment adapter;
    Button btnComment;
    EditText edtComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        rvComment = findViewById(R.id.lv_post_comment);
        edtComment = findViewById(R.id.edt_comment);
        btnComment = findViewById(R.id.btn_comment);

        commentList = new ArrayList<>();

        for(int i=0;i<50;i++){
            commentList.add(new Comment(i+"", "comment "+ i,
                    "Hello User Number "+ i, "owner "+i, "2 hours"));
        }

        commentList.add(new Comment(1+"", "comment "+ 1,
                "", "owner ", "2 hours"));

        adapter = new AdapterRCVComment(commentList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvComment.setAdapter(adapter);
        rvComment.setLayoutManager(llm);
    }


}
