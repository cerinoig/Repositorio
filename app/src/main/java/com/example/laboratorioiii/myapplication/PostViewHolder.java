package com.example.laboratorioiii.myapplication;

/**
 * Created by Ivan on 7/7/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;




public class PostViewHolder extends RecyclerView.ViewHolder{


    public TextView tituloView, autorView,pasosView,ingredientesView;



    public PostViewHolder(View itemView) {
        super(itemView);

        tituloView = (TextView) itemView.findViewById(R.id.post_titulo);
        autorView = (TextView) itemView.findViewById(R.id.post_autor);
        pasosView = (TextView) itemView.findViewById(R.id.post_pasos);
        ingredientesView = (TextView) itemView.findViewById(R.id.post_ingredientes);


    }

}
