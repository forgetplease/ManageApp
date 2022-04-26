package com.example.manageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
        private Button registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        registerBtn=findViewById(R.id.action_submit);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerBtn=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(registerBtn);
                Toast.makeText(RegisterActivity.this,"恭喜您！注册成功",Toast.LENGTH_SHORT).show();
            }
        });

    }
}