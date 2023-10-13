package com.fabiansuarez.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tvGoRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvGoRegister =findViewById(R.id.tv_go_register);

        tvGoRegister.setOnClickListener(view -> {
            Intent goRegister = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(goRegister);
            finish();
        });
    }
}