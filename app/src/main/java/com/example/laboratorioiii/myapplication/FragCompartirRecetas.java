package com.example.laboratorioiii.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 */
public class FragCompartirRecetas extends Fragment {

    private TextView ingresarTitulo;
    private TextView ingresarPasos;
    private TextView ingresarIngredientes;
    boolean click = false;

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

        FloatingActionButton btn = (FloatingActionButton) view.findViewById(R.id.CargarAFirebase);


        ingresarTitulo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

        ((MainActivity) getActivity()).cambiarSavingFragment(new PoneTuTitulo());

            }


        });

        ingresarPasos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ((MainActivity) getActivity()).cambiarSavingFragment(new Pasos());

            }


        });

        ingresarIngredientes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).cambiarSavingFragment(new FragIngredientes());

            }


        });


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                List<String> pasos = ((MainActivity) getActivity()).receta.getPasos();
                List<String> ingredientes = ((MainActivity) getActivity()).receta.getIngredientes();
                String titulo = ((MainActivity) getActivity()).receta.getTitulo();
                String autor = ((MainActivity) getActivity()).receta.getAutor();

                ((MainActivity) getActivity()).writeNewPost(titulo, autor, pasos, ingredientes);

            }




        });


    }

}
