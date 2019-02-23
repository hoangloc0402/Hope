package com.sunset.hope;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityLeaveMessage extends AppCompatActivity {

    Button btn_Cancel;
    Button btn_Send;
    TextView tv_title;
    EditText edt_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_message);

        mapping();

        btn_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    void mapping(){
        btn_Cancel = findViewById(R.id.btn_message_cancel);
        btn_Send = findViewById(R.id.btn_leave_message);
        tv_title = findViewById(R.id.tv_post_title);
        edt_message = findViewById(R.id.edt_leave_message);
    }
}
