package com.example.laboratorioiii.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


//public class MainActivity extends AppCompatActivity {

public class MainActivity extends FragmentActivity {

    public  Recetas receta ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        receta = new Recetas();

        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.LinearMain,new  BlankFragment());

        ft.addToBackStack(null);

        ft.commit();


    }

    public void cambiarFragment(Fragment fr){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.LinearMain,fr);

        ft.commit();


    }

    public Recetas getReceta() {
        return receta;
    }

    public void setReceta(Recetas receta) {
        this.receta = receta;
    }
}