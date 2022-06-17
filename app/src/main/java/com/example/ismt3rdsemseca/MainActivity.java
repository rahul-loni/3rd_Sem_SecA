package com.example.ismt3rdsemseca;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

        Intent intantLogin=new Intent(MainActivity.this,List.class);
        startActivity(intantLogin);

    }

    public void Signup(View view) {
        Intent intantSignup=new Intent(MainActivity.this,List.class);
        startActivity(intantSignup);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent intent=new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}