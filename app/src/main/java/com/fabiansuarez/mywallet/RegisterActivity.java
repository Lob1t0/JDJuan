package com.fabiansuarez.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private TextView tvGoLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tvGoLogin=findViewById(R.id.tv_go_login);
        tvGoLogin.setOnClickListener(view -> {
            Intent goLogin = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(goLogin);
            finish();
        });
    }
}