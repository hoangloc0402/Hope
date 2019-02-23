package com.sunset.hope;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityPostDetail extends AppCompatActivity {

    ListView lvComment;
    ArrayList<Comment> commentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        lvComment = findViewById(R.id.lv_post_comment);

        commentList = new ArrayList<Comment>();

        commentList.add(new Comment("1", "1", "Hello", "Lampard"));
        commentList.add(new Comment("1", "2", "HelloWorld", "Lampard"));
        commentList.add(new Comment("1", "3", "HelloYou", "Thanh"));
        commentList.add(new Comment("1", "4", "HelloMe", "Lampard"));

        AdapterPostDetail adapter = new AdapterPostDetail(ActivityPostDetail.this,
                R.layout.comment_layout, commentList);

        lvComment.setAdapter(adapter);
    }


}
