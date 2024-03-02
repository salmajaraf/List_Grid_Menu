package com.example.app_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Liste_villes extends AppCompatActivity {
    Button b100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_villes);
        b100=findViewById(R.id.b100);

        b100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i200= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i200);
            }
        });


        LinearLayout ville1 = findViewById(R.id.ville1);
        LinearLayout ville2 = findViewById(R.id.ville2);
        LinearLayout ville3 = findViewById(R.id.ville3);

        ville1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(getApplicationContext(), VilleDetails.class);
                startActivity(i5);
                //Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
            }
        });

        ville2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6= new Intent(getApplicationContext(), VilleDetails.class);
                startActivity(i6);
            }
        });

        ville3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7= new Intent(getApplicationContext(), VilleDetails.class);
                startActivity(i7);
            }
        });
    }
}