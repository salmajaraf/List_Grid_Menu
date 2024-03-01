package com.example.app_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button amis,pays,fruits;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amis=findViewById(R.id.Amis);
        pays = findViewById(R.id.Pays);
        fruits = findViewById(R.id.Fruits);
        amis.setOnClickListener(this);
        pays.setOnClickListener(this);
        fruits.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        Class destinationActivity = null;
        if (v.getId() == R.id.Fruits) {
            destinationActivity = Fruits.class;
        } else if (v.getId() == R.id.Amis) {
            destinationActivity = Amis.class;
        } else if (v.getId() == R.id.Pays) {
            destinationActivity = Pays.class;
        }
        Intent intent = new Intent(MainActivity.this, destinationActivity);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}