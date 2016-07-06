package com.example.laboratorioiii.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.firebase.database.*;
import com.google.firebase.database.DatabaseReference;
import com.example.laboratorioiii.myapplication.Clases.Receta;
import java.util.HashMap;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class PoneTuTitulo extends Fragment {
        private EditText ingreseTitulo;
        private EditText ingreseAutor;
        private Button BotonGuardar;
        DatabaseReference mDatabase;
        DatabaseReference mPostsReference;

    public PoneTuTitulo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pone_tu_titulo, container, false);


    }


    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mPostsReference = mDatabase.child("posts");

        ingreseTitulo = (EditText) view.findViewById(R.id.ingreseTitulo);

        ingreseAutor = (EditText) view.findViewById(R.id.ingreseAutor);

        BotonGuardar = (Button)   view.findViewById(R.id.ContinuarTitulo);


        BotonGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ((MainActivity) getActivity()).receta.setTitulo(ingreseTitulo.getText().toString());
                ((MainActivity) getActivity()).receta.setAutor(ingreseAutor.getText().toString());


            }


        });

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




}
