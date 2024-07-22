package com.example.thejournalapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button loginBtn, createAccountBtn;
    private EditText emailEt, passEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createAccountBtn = findViewById(R.id.creat_account);

        createAccountBtn.setOnClickListener(v -> {
            // Onclick()
            Intent i = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(i);

        });
    }
}