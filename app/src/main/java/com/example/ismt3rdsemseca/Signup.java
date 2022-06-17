package com.example.ismt3rdsemseca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Signup extends AppCompatActivity {

    Spinner Myspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Myspinner=findViewById(R.id.spinner);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Rahul");
        arrayList.add("Rohan");
        arrayList.add("Rupak");
        arrayList.add("Binod Sir");
        arrayList.add("Asmit");
        arrayList.add("Ashok Sir");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}