package com.sunset.hope;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Type;
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
    private TextView notiText = null;
    private Spinner typeInput = null;
    private Spinner tagsInput = null;
    private static LayoutInflater inflater;
    private static View view;

    private static Pattern emailRegexPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$", Pattern.CASE_INSENSITIVE);

    public void setTypeSpinnerElements(){
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Types.getTypeList().icon, Types.getTypeList().text);
        typeInput.setAdapter(customAdapter);
    }

    public void setTagSpinnerElements(){
        List<String> categories = new ArrayList<String>();
        categories.add("Select Tag");
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
        notiText = findViewById(R.id.txtview_noti);
        typeInput = findViewById(R.id.spn_type);
        tagsInput = findViewById(R.id.spn_tags);

        setTypeSpinnerElements();
        setTagSpinnerElements();

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailString = emailInput.getText().toString();

                if (!checkInfo(emailString)) {
                    notiText.setText("Wrong email");
                }
                else if ((typeInput.getSelectedItemId() == 0) || (tagsInput.getSelectedItemId() == 0)) {
                    notiText.setText("Wrong type or tag");
                }
                else {
                    String phoneNumberString = phoneNumberInput.getText().toString();
                    String addressString = addressInput.getText().toString();
                    String titleString = titleInput.getText().toString();
                    String descriptionString = descriptionInput.getText().toString();
                    String typeString = typeInput.getSelectedItem().toString();
                    String tagsString = tagsInput.getSelectedItem().toString();

                    Log.d("type_get", typeString);
                    Log.d("tag_get", tagsString);

                    Contact contact = new Contact(phoneNumberString, emailString, addressString);
//                    Post post = new Post("P111111", "U111111", typeString, new String[]{"", ""}, new int[]{0,0}, descriptionString, false, 0, titleString, contact);

                    //send to Firebase
                }
            }
        });
    }

    public boolean checkInfo(String emailString){
        return (emailRegexPattern.matcher(emailString).matches());
    }
}
