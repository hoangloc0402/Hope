package com.sunset.hope.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.sunset.hope.adapters.AdapterRCVComment;
import com.sunset.hope.entities.Comment;
import com.sunset.hope.R;
import com.sunset.hope.entities.Post;

import java.util.ArrayList;
import java.util.Date;

public class ActivityPostDetail extends AppCompatActivity {

    RecyclerView rvComment;
    ArrayList<Comment> commentList;
    AdapterRCVComment adapter;
    Button btnComment;
    EditText edtComment;

    TextView tv_post_name, tv_post_date, tv_post_content;
    ImageView img_post_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        rvComment = findViewById(R.id.lv_post_comment);
        edtComment = findViewById(R.id.edt_comment);
        btnComment = findViewById(R.id.btn_comment);
        tv_post_content = findViewById(R.id.tv_post_content);
        tv_post_date = findViewById(R.id.tv_post_date);
        tv_post_name = findViewById(R.id.tv_post_name);
        img_post_avatar = findViewById(R.id.imv_post_image);

        commentList = new ArrayList<>();
        Intent intent = getIntent();

        Post post = MainActivity.postData.get(intent.getIntExtra("post", 0));

        img_post_avatar.setImageResource(post.getUser().getAvatarResource());
        commentList = post.getCommentList();
        tv_post_name.setText(post.getUser().getFullName());
        tv_post_date.setText(post.getTime() +"");
        tv_post_content.setText(post.getDescription());



        adapter = new AdapterRCVComment(commentList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvComment.setAdapter(adapter);
        rvComment.setLayoutManager(llm);

        btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newComment = edtComment.getText().toString();
                Comment comment = new Comment(post.getPostId(), String.valueOf(commentList.size()+1),newComment,"vanthanh", "Just Now");
                commentList.add(comment);
                edtComment.setText("");
                adapter.notifyDataSetChanged();
            }
        });
    }


}
