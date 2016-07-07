package com.example.laboratorioiii.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private LinearLayout recetas;
    private LinearLayout quecocino;
    private LinearLayout compartirReceta;
    private LinearLayout info;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recetas = (LinearLayout) view.findViewById(R.id.btn1);
        quecocino = (LinearLayout) view.findViewById(R.id.btn2);
        compartirReceta = (LinearLayout) view.findViewById(R.id.btn3);
        info = (LinearLayout) view.findViewById(R.id.btn4);

        recetas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), Recetas.class);
                startActivity(intent);
            }

        });

        quecocino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setClass(v.getContext(), Recetas.class);
                startActivity(intent);
            }

        });

        compartirReceta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ((MainActivity) getActivity()).cambiarSavingFragment(new FragCompartirRecetas());
            }


        });



    }
}

