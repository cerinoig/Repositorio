package com.example.laboratorioiii.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.example.laboratorioiii.myapplication.Clases.Receta;

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

        mPostsReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.

                /*  String value = dataSnapshot.getValue(String.class);
                 tv.setText(value);*/

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });


    }

    public void cambiarFragment(Fragment fr){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.LinearMain,fr);

        ft.commit();


    }

    private void writeNewPost(String titulo, String autor,List<String> pasos, List<String> ingredientes) {

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