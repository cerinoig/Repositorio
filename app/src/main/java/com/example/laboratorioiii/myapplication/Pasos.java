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

        continuarPaso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

             //   ((MainActivity)getActivity()).getReceta()


            }


        });

    }
}
