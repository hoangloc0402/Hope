package com.sunset.hope;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
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
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),Types.getTypeList().icon, Types.getTypeList().text);
        typeInput.setAdapter(customAdapter);
    }

    public void setTagSpinner(){
        List<String> categories = new ArrayList<String>();
        categories.add("Select Type");
        categories.add("Donate");
        categories.add("Request");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tagsInput.setAdapter(dataAdapter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

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
    }


    public boolean checkInfo(String emailString){
        return (emailRegexPattern.matcher(emailString).matches());
    }
}
