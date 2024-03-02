package com.example.app_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Fruits extends AppCompatActivity {
    ListView listefruit;
    String[] fruits = {
            "Banane 12 Dh",
            "Pomme 8 Dh",
            "Orange 10 Dh",
            "Fraise 20 Dh",
            "Ananas 15 Dh",
            "Mangue 18 Dh",
            "Kiwi 7 Dh",
            "Poire 9 Dh",
            "Cerise 25 Dh",
            "Pêche 14 Dh",
            "Abricot 16 Dh",
            "Melon 12 Dh",
            "Pastèque 20 Dh",
            "Raisin 30 Dh",
            "Citron 6 Dh",
            "Pamplemousse 11 Dh",
            "Prune 13 Dh",
            "Grenade 17 Dh",
            "Figues 22 Dh",
            "Papaye 19 Dh"
    };
    Button b88;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        listefruit = findViewById(R.id.fruitliste);
        b88 = findViewById(R.id.b88);

        listefruit.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruits));

        b88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i1);
            }
        });
    }
}