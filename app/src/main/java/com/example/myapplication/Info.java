package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView name = findViewById(R.id.textView);
        TextView password = findViewById(R.id.textView3);
        Bundle extras = getIntent().getExtras();
        name.setText("UserName: " + extras.getString("etUserName"));
        password.setText("Password: " + extras.getString("etPassword"));
    }
}