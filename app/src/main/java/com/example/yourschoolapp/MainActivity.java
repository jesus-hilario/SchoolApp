package com.example.yourschoolapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnUnion = (Button) findViewById(R.id.btnUnion);
        Button btnNjit = (Button) findViewById(R.id.btnNjit);
        Button btnPrinceton = (Button) findViewById(R.id.btnPrinceton);

        btnUnion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, aboutUcc.class));
            }
        });

        btnNjit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutNjit.class));
            }
        });

        btnPrinceton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutPrinceton.class));
            }
        });

    }


}