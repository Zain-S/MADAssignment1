package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Tag", "onCreateActivity()");
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.BT_Submit);
        EditText etUserName = findViewById(R.id.ET_Username);
        EditText etPassword = findViewById(R.id.ET_Password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Info.class);
                intent.putExtra("etUserName", etUserName.getText().toString());
                intent.putExtra("etPassword", etPassword.getText().toString());
                Log.d("InfoActivity", "Activity Started");
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag", "onStartActivity()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag", "onPauseActivity()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag", "onDestroyActivity()");
    }
}