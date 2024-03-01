package com.example.app_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Pays extends AppCompatActivity {
    Button b83;
    String[] pays = {
            "Maroc",
            "France",
            "Chine",
            "États-Unis",
            "Espagne",
            "Inde",
            "Brésil",
            "Royaume-Uni"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pays);

        b83 = findViewById(R.id.b83);
        Spinner spinner = findViewById(R.id.spinnerpays);
        b83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i3);
            }
        });

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pays);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}