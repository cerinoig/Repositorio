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
public class Pasos extends Fragment {

    private Button   continuarPaso;
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

                String paso1Validado = paso1.getText().toString();
                String paso2Validado = paso2.getText().toString();
                String paso3Validado = paso3.getText().toString();
                String paso4Validado = paso4.getText().toString();;
                String paso5Validado = paso5.getText().toString();;
                String paso6Validado = paso6.getText().toString();;
                String paso7Validado = paso7.getText().toString();;

                List<String> pasos = new ArrayList<>();

                if (TextUtils.isEmpty(paso1Validado)) {
                    paso1.setError("Ingrese al menos el primer paso");
                } else  {
                    pasos.add(paso1Validado);
                }

                if (!TextUtils.isEmpty(paso2Validado)) {

                        pasos.add(paso2Validado);

                }

                if(!TextUtils.isEmpty(paso3Validado)){

                        pasos.add(paso3Validado);

                }

                if(!TextUtils.isEmpty(paso4Validado)){

                        pasos.add(paso4Validado);

                }

                if(!TextUtils.isEmpty(paso5Validado)){

                        pasos.add(paso5Validado);

                }

                if(!TextUtils.isEmpty(paso6Validado)){

                        pasos.add(paso6Validado);
                }

                if(!TextUtils.isEmpty(paso7Validado)){
                        pasos.add(paso7Validado);
                }


                ((MainActivity)getActivity()).receta.setPasos(pasos);


                paso1.setText("");
                paso2.setText("");
                paso3.setText("");
                paso4.setText("");
                paso5.setText("");
                paso6.setText("");
                paso7.setText("");

            }


        });

    }
}
