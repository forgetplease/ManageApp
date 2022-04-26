package com.example.manageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
        private TextView registerBtn;
        private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registerBtn=findViewById(R.id.action_registration);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(register);
            }
        });
        loginBtn=findViewById(R.id.action_login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginBtn=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(loginBtn);
                SharedPreferences prf=getSharedPreferences("data",MODE_PRIVATE);
                String name=prf.getString("name","");
                String home=prf.getString("home","");
                int phone =prf.getInt("phone",0);
                Toast.makeText(LoginActivity.this,"恭喜您！登陆成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}