package com.example.android_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String arr[]={"MCA","BTech","MBA","BSc","MSc","MTech"};
    ListView l1;
    ArrayAdapter <String> arrAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,arr);
        l1=findViewById(R.id.listview1);
        l1.setAdapter(arrAdapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String x=(String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, x, Toast.LENGTH_SHORT).show();
            }
        });

    }
}