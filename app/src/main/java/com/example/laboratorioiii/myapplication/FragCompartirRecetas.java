package com.example.laboratorioiii.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragCompartirRecetas extends Fragment {

    private TextView ingresarTitulo;
    private TextView ingresarPasos;
    private TextView ingresarIngredientes;


    public FragCompartirRecetas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_compartir_recetas, container, false);
    }


    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ingresarTitulo = (TextView) view.findViewById(R.id.ingresarTitulo);
        ingresarPasos = (TextView) view.findViewById(R.id.pasos);
        ingresarIngredientes = (TextView) view.findViewById(R.id.Ingredientes);


        ingresarTitulo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

        ((MainActivity) getActivity()).cambiarFragment(new PoneTuTitulo());

            }


        });

        ingresarPasos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ((MainActivity) getActivity()).cambiarFragment(new Pasos());

            }


        });

        ingresarIngredientes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).cambiarFragment(new FragCompartirRecetas());

            }


        });



    }

}
