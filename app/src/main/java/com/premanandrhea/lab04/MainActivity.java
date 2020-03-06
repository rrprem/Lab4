package com.premanandrhea.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open3();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open4();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open5();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open6();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open7();
            }
        });

    }

    public void open1(){
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }
    public void open2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void open3(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void open4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void open5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void open6(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void open7(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
}

