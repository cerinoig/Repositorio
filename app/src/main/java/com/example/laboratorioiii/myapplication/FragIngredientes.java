package com.example.laboratorioiii.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.laboratorioiii.myapplication.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragIngredientes extends Fragment {

    private Button   continuar;
    private EditText ingrediente1;
    private EditText ingrediente2;
    private EditText ingrediente3;
    private EditText ingrediente4;
    private EditText ingrediente5;
    private EditText ingrediente6;
    private EditText ingrediente7;

    public FragIngredientes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_ingredientes, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ingrediente1 = (EditText) view.findViewById(R.id.IngresoIngrediente1);
        ingrediente2 = (EditText) view.findViewById(R.id.IngresoIngrediente2);
        ingrediente3 = (EditText) view.findViewById(R.id.IngresoIngrediente3);
        ingrediente4 = (EditText) view.findViewById(R.id.IngresoIngrediente4);
        ingrediente5 = (EditText) view.findViewById(R.id.IngresoIngrediente5);
        ingrediente6 = (EditText) view.findViewById(R.id.IngresoIngrediente6);
        ingrediente7 = (EditText) view.findViewById(R.id.IngresoIngrediente7);

        continuar = (Button) view.findViewById(R.id.ContinuarIngredientes);

        continuar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                List<String> ingredientes = null;

                ingredientes.add(ingrediente1.getText().toString());
                ingredientes.add(ingrediente1.getText().toString());
                ingredientes.add(ingrediente1.getText().toString());
                ingredientes.add(ingrediente1.getText().toString());
                ingredientes.add(ingrediente1.getText().toString());
                ingredientes.add(ingrediente1.getText().toString());
                ingredientes.add(ingrediente1.getText().toString());

             ((MainActivity)getActivity()).receta.setPasos(ingredientes);


            }


        });

    }

}
