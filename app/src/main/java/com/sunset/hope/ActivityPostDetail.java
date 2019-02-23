package com.sunset.hope;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityPostDetail extends AppCompatActivity {

    ListView lvComment;
    ArrayList<Comment> commentList;
    TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        lvComment = findViewById(R.id.lv_post_comment);
        tvContent = findViewById(R.id.tv_post_content);
        commentList = new ArrayList<Comment>();

        commentList.add(new Comment("1", "1", "Hellosadddddddddkjas jkasdhaskdjsahdkja shdkjash dkjasdhakjsd hasjkdhaskjdhaskjd haksjd hakjsdh askjdhass a", "Lampard"));
        commentList.add(new Comment("1", "2", "HelloWorld", "Lampard"));
        commentList.add(new Comment("1", "3", "HelloYou", "Thanh"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));

        Toast.makeText(this, ""+commentList.size(), Toast.LENGTH_SHORT).show();
        AdapterPostDetail adapter = new AdapterPostDetail(ActivityPostDetail.this,
                R.layout.comment_layout, commentList);

        lvComment.setAdapter(adapter);
    }


}
