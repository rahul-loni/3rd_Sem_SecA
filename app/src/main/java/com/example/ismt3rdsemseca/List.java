package com.example.ismt3rdsemseca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List extends AppCompatActivity {
   ListView mlist;
    String countryList[] = {"Nepal","India", "China", "australia", "Portugle", "America", "NewZealand",
            "Rahul","Ashok","Ranjan","Sunny Panday","Hari"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mlist=findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list,
                R.id.textView, countryList);
        mlist.setAdapter(arrayAdapter);

//        mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(List.this, "Click Me"+countryList, Toast.LENGTH_SHORT).show();
//                if(i==1){
//                    Intent item1intent=new Intent(getApplicationContext(),Login.class);
//                    startActivity(item1intent);
//                }
//            }
//        });

        mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(List.this, "You Click Me "+countryList, Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent item0=new Intent(List.this,Login.class);
                    startActivity(item0);

                }
                if (position==1){
                    Intent item1=new Intent(List.this,Signup.class);
                    startActivity(item1);

                }
            }
        });
    }
}