package com.sunset.hope.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.sunset.hope.entities.Contact;
import com.sunset.hope.adapters.CustomAdapter;
import com.sunset.hope.R;
import com.sunset.hope.entities.Types;

import java.util.regex.Pattern;

public class ActivityPost extends AppCompatActivity {
    private ImageView userAvatar = null;
    private TextView userName = null;
    private EditText emailInput = null;
    private EditText phoneNumberInput = null;
    private EditText addressInput = null;
    private EditText titleInput = null;
    private EditText descriptionInput = null;
    private Button postButton =  null;
    private TextView emailNoti = null;
    private Spinner typeInput = null;
    private Spinner tagsInput = null;

    private static Pattern emailRegexPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$", Pattern.CASE_INSENSITIVE);


    public void setTypeSpinner(){
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Types.getTypeList().getIcon(), Types.getTypeList().getText());
        typeInput.setAdapter(customAdapter);
    }

    public void setTagSpinner(){
        int[] icon = {R.drawable.spn_drop_down, R.drawable.spn_donate, R.drawable.spn_help};
        String[] text = {"Select Tag", "Donate", "Request"};

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), icon, text);
        tagsInput.setAdapter(customAdapter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        userAvatar = findViewById(R.id.img_avatar);
        userName = findViewById(R.id.txtview_name);
        emailInput = findViewById(R.id.txt_email);
        phoneNumberInput = findViewById(R.id.txt_phone);
        addressInput = findViewById(R.id.txt_address);
        titleInput = findViewById(R.id.txt_title);
        descriptionInput = findViewById(R.id.txt_description);
        postButton = findViewById(R.id.btn_post);
        emailNoti = findViewById(R.id.txtview_noti);
        typeInput = findViewById(R.id.spn_type);
        tagsInput = findViewById(R.id.spn_tags);


        userAvatar.setImageResource(R.drawable.avatar_01);
        userName.setText(MainActivity.currentUser.getFullName());
        emailInput.setText(MainActivity.currentUser.getContact().getEmail());
        phoneNumberInput.setText(MainActivity.currentUser.getContact().getPhoneNumber());
        addressInput.setText(MainActivity.currentUser.getContact().getAddress());

        setTypeSpinner();
        setTagSpinner();

        postButton.setOnClickListener(v -> {
            String emailString = emailInput.getText().toString();

            if (!checkInfo(emailString)) {
                emailNoti.setText("Wrong email");
            }
            else {
                String phoneNumberString = phoneNumberInput.getText().toString();
                String addressString = addressInput.getText().toString();
                String titleString = titleInput.getText().toString();
                String descriptionString = descriptionInput.getText().toString();
                String typeString = typeInput.getSelectedItem().toString();
                String tagsString = tagsInput.getSelectedItem().toString();

                Contact contact = new Contact(phoneNumberString, emailString, addressString);
//                    Post post = new Post("P111111", "U111111", typeString, new String[]{"", ""}, new int[]{0,0}, descriptionString, false, 0, titleString, contact);

                //send to Firebase
            }
        });

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog.show(ActivityPost.this, "", "Be happy <3");
            }
        });
    }


    public boolean checkInfo(String emailString){
        return (emailRegexPattern.matcher(emailString).matches());
    }
}
