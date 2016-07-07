package com.example.laboratorioiii.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class PoneTuTitulo extends Fragment {
        private EditText ingreseTitulo;
        private EditText ingreseAutor;
        private Button BotonGuardar;

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

        BotonGuardar = (Button)   view.findViewById(R.id.ContinuarTitulo);


        BotonGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ((MainActivity) getActivity()).receta.setTitulo(ingreseTitulo.getText().toString());
                ((MainActivity) getActivity()).receta.setAutor(ingreseAutor.getText().toString());


            }


        });




    }




}
