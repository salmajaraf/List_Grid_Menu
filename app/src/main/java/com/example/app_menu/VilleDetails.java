package com.example.app_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VilleDetails extends AppCompatActivity {
    Button b800;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ville_details);

        b800=findViewById(R.id.b800);
        b800.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i100= new Intent(getApplicationContext(), Liste_villes.class);
                startActivity(i100);
            }
        });
    }
}