package com.example.laboratorioiii.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
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

                List<String> ingredientes = new ArrayList<>();

                String ingredienteValidado1 = ingrediente1.getText().toString();
                String ingredienteValidado2 = ingrediente2.getText().toString();
                String ingredienteValidado3 = ingrediente3.getText().toString();
                String ingredienteValidado4 = ingrediente4.getText().toString();
                String ingredienteValidado5 = ingrediente5.getText().toString();
                String ingredienteValidado6 = ingrediente6.getText().toString();
                String ingredienteValidado7 = ingrediente7.getText().toString();

                if (TextUtils.isEmpty(ingredienteValidado1)) {
                    ingrediente1.setError("Ingrese al menos el primer paso");
                } else {

                            ingredientes.add(ingredienteValidado1);
                }

                if (!TextUtils.isEmpty(ingredienteValidado2)) {

                            ingredientes.add(ingredienteValidado2);
                }

                if (!TextUtils.isEmpty(ingredienteValidado3)) {

                            ingredientes.add(ingredienteValidado3);


                }
                if (!TextUtils.isEmpty(ingredienteValidado4)) {


                            ingredientes.add(ingredienteValidado4);


                }
                if (!TextUtils.isEmpty(ingredienteValidado5)) {


                            ingredientes.add(ingredienteValidado5);


                }
                if (!TextUtils.isEmpty(ingredienteValidado6)) {


                            ingredientes.add(ingredienteValidado6);


                }
                    if (!TextUtils.isEmpty(ingredienteValidado7)) {


                                ingredientes.add(ingredienteValidado7);


                    }
                        ((MainActivity) getActivity()).receta.setIngredientes(ingredientes);

                ingrediente1.setText("");
                ingrediente2.setText("");
                ingrediente3.setText("");
                ingrediente4.setText("");
                ingrediente5.setText("");
                ingrediente6.setText("");
                ingrediente7.setText("");


            }


        });

    }

}
