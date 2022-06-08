package com.example.ismt3rdsemseca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
  Button Login_btn,Signup_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login_btn=(Button) findViewById(R.id.btn_login);
        Signup_btn=(Button) findViewById(R.id.btn_Signup);
    }

    public void Login(View view) {

        Intent intantLogin=new Intent(MainActivity.this,Login.class);
        startActivity(intantLogin);

    }

    public void Signup(View view) {
        Intent intantSignup=new Intent(MainActivity.this,Signup.class);
        startActivity(intantSignup);
    }
}