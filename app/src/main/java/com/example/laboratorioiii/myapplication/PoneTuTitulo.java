package com.example.laboratorioiii.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class PoneTuTitulo extends Fragment {
        private EditText ingreseTitulo;
        private EditText ingreseAutor;

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

        ingreseTitulo = (EditText) view.findViewById(R.id.ingreseTitulo);

        ingreseAutor = (EditText) view.findViewById(R.id.ingreseAutor);

        ingreseTitulo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ingreseTitulo.getText();


            }


        });

        ingreseAutor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ingreseAutor.getText();


            }


        });



    }
}
