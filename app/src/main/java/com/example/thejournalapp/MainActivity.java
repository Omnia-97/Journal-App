package com.example.thejournalapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button loginBtn, createAccountBtn;
    private EditText emailEt, passEt;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser currentUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createAccountBtn = findViewById(R.id.creat_account);

        createAccountBtn.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(i);

        });

        loginBtn = findViewById(R.id.email_signin);
        emailEt = findViewById(R.id.email);
        passEt = findViewById(R.id.password);
        firebaseAuth = FirebaseAuth.getInstance();

        loginBtn.setOnClickListener(v -> {
            loginEmailPassUser(emailEt.getText().toString(), passEt.getText().toString());
                }

        );
    }
    private void loginEmailPassUser( String email , String pass){
        if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(pass)){
            firebaseAuth.signInWithEmailAndPassword(
                    email , pass
            ).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    FirebaseUser user = firebaseAuth.getCurrentUser();

                    Intent i = new Intent(MainActivity.this, JournalListActivity.class);
                    startActivity(i);
                }

            });
        }

    }


}