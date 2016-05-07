package com.example.laboratorioiii.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout recetas;
    private LinearLayout quecocino;
    private LinearLayout compartirReceta;
    private LinearLayout info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recetas = (LinearLayout) findViewById(R.id.btn1);
        quecocino = (LinearLayout) findViewById(R.id.btn2);
        compartirReceta = (LinearLayout) findViewById(R.id.btn3);
        info = (LinearLayout) findViewById(R.id.btn4);

        recetas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), Recetas.class);
                startActivity(intent);
            }

        });

        quecocino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(v.getContext(), Recetas.class);
                startActivity(intent);
            }

        });

        compartirReceta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(v.getContext(), Recetas.class);
                startActivity(intent);
            }


        });
    }
}