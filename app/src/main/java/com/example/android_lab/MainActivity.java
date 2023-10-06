package com.example.android_lab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.main_menu, menu);
    return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.t1){
            Toast.makeText(this, "first_item", Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.t2){
            Toast.makeText(this, "Second_item", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}