package com.sunset.hope.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sunset.hope.R;

public class ActivityLogin extends AppCompatActivity {
    private EditText emailInput = null;
    private EditText passwordInput = null;
    private Button loginButton = null;
    private TextView signUpTextView = null;
    private Intent intent = null;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailInput = findViewById(R.id.input_email);
        passwordInput = findViewById(R.id.input_password);
        loginButton = (Button) findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Send to Firebase
                String emailString = emailInput.getText().toString();
                String passwordString = passwordInput.getText().toString();



                /*byte returnCode = checkLogin(emailString, passwordString);
                if (returnCode == -1) {

                }
                else if (returnCode == -2){

                }*/


            }
        });

        signUpTextView = (TextView) findViewById(R.id.link_signup);
        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), ActivitySignUp.class);
                startActivity(intent);
            }
        });
    }


}
