package com.sunset.hope;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ActivitySignUp extends AppCompatActivity {
    private static Pattern emailRegexPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$", Pattern.CASE_INSENSITIVE);
    private EditText nameInput = null;
    private EditText emailInput = null;
    private EditText phoneInput = null;
    private EditText passwordInput = null;
    private EditText repasswordInput = null;
    private TextView annouceText = null;
    private Button signUpButton = null;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        nameInput = findViewById(R.id.input_name);
        emailInput = findViewById(R.id.input_email);
        phoneInput = findViewById(R.id.input_mobile);
        passwordInput = findViewById(R.id.input_password);
        repasswordInput = findViewById(R.id.input_reEnterPassword);
        annouceText = findViewById(R.id.annouce_text);
        signUpButton = findViewById(R.id.btn_signup);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameString = nameInput.getText().toString();
                String emailString = emailInput.getText().toString();
                String phoneString = phoneInput.getText().toString();
                String passwordString = passwordInput.getText().toString();
                String repasswordString = repasswordInput.getText().toString();

                String annouce = "";

                switch (checkLogin(nameString, phoneString, emailString, passwordString, repasswordString)) {
                    case -1: annouce = "Wrong email format"; break;
                    case -2: annouce = "Password at least 6 characters"; break;
                    case -3: annouce = "Passwords not match"; break;
                    case -4: annouce = "Empty field"; break;
                    case 1: /*sent to Firebase*/ break;
                    default:  break;
                }
                annouceText.setText(annouce);
            }
        });

    }


    public byte checkLogin(String nameString, String phoneString, String emailString, String passwordString, String repasswordString) {
        /* return code = -1 if email is invalid
                       =  -2 if password is invalid
                       =  -3 if password not match
                       =  -4 if existing at least one empty field
                       =  1 if OK
        */
        if (nameString.isEmpty() || phoneString.isEmpty() || passwordString.isEmpty() || repasswordString.isEmpty() || emailString.isEmpty()) return -4;
        if (!emailRegexPattern.matcher(emailString).matches()) return -1;
        if (passwordString.length() < 6) return -2;
        if (!passwordString.equals(repasswordString)) return -3;
        return 1;
    }
}
