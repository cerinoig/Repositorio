package com.example.laboratorioiii.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.laboratorioiii.myapplication.Clases.Receta;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private  DatabaseReference mPostsReference;


    public  Receta receta ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        receta = new Receta();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.LinearMain,new  BlankFragment());

        ft.addToBackStack(null);

        ft.commit();

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mPostsReference = mDatabase.child("posts");



    }

    public void cambiarFragment(Fragment fr){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.LinearMain,fr);

        ft.commit();


    }


    public void cambiarSavingFragment(Fragment fr){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.LinearMain,fr);

        ft.addToBackStack(null);

        ft.commit();


    }

    void writeNewPost(String titulo, String autor, List<String> pasos, List<String> ingredientes) {

        String key = mPostsReference.push().getKey();
        Receta recetaPost = new Receta(titulo,autor,pasos,ingredientes);
        Map<String, Object> postValues = recetaPost.toMap();
        Map<String, Object> newPostNode = new HashMap<>();
        newPostNode.put(key, postValues);
        mPostsReference.updateChildren(newPostNode);

    }



    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}