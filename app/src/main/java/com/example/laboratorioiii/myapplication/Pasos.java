package com.example.laboratorioiii.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pasos extends Fragment {

    private Button continuarPaso;
    private EditText paso1;
    private EditText paso2;
    private EditText paso3;
    private EditText paso4;
    private EditText paso5;
    private EditText paso6;
    private EditText paso7;

    public Pasos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pasos, container, false);




    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        paso1 = (EditText) view.findViewById(R.id.ingresePaso1);
        paso2 = (EditText) view.findViewById(R.id.ingresePaso2);
        paso3 = (EditText) view.findViewById(R.id.ingresePaso3);
        paso4 = (EditText) view.findViewById(R.id.ingresePaso4);
        paso5 = (EditText) view.findViewById(R.id.ingresePaso5);
        paso6 = (EditText) view.findViewById(R.id.ingresePaso6);
        paso7 = (EditText) view.findViewById(R.id.ingresePaso7);

        continuarPaso = (Button) view.findViewById(R.id.ContinuarPasos);


        continuarPaso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                List<String> pasos = null;

                pasos.add(paso1.getText().toString());
                pasos.add(paso2.getText().toString());
                pasos.add(paso3.getText().toString());
                pasos.add(paso4.getText().toString());
                pasos.add(paso5.getText().toString());
                pasos.add(paso6.getText().toString());
                pasos.add(paso7.getText().toString());

                ((MainActivity)getActivity()).receta.setPasos(pasos);


            }


        });

    }
}
