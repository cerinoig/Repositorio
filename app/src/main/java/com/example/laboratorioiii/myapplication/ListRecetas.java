package com.example.laboratorioiii.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.laboratorioiii.myapplication.Clases.Receta;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListRecetas extends Fragment {
    private RecyclerView postsRecycler;
    private DatabaseReference mDatabase;
    private FirebaseRecyclerAdapter<Receta,PostViewHolder> mAdapter;


    public ListRecetas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_recetas, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        super.onCreate(savedInstanceState);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        postsRecycler = (RecyclerView) ((MainActivity)getActivity()).findViewById(R.id.posts_recycler_view);
        postsRecycler.setHasFixedSize(true);

        //DEFINO EL ADAPTER PARA EL RECYCLER VIEW
        // @param PostContent.class  clase del modelo que vamos a mostrar
        // @param R.layout.post_layout  layout del item
        // @param PostViewHolder.class  clase del ViewHolder del RecyclerView
        // @param PostViewHolder.class  clase del ViewHolder del RecyclerView
        // @param mDatabase.child("posts")  referencia de Firebase de donde voy a obtener el listado

        mAdapter = new FirebaseRecyclerAdapter<Receta, PostViewHolder>(Receta.class, R.layout.post_layout,
                PostViewHolder.class, mDatabase.child("posts")) {

            @Override
            protected void populateViewHolder(final PostViewHolder postViewHolder, final Receta post, final int position) {

                postViewHolder.tituloView.setText(post.getTitulo());
                postViewHolder.autorView.setText(post.getAutor());
                //como hacer esto???!!!! dinamicamente??
                postViewHolder.ingredientesView.setText(getListStrings(post.getIngredientes()));//me devueleve el lsitado
                postViewHolder.pasosView.setText(getListStrings(post.getPasos()));

            }
        };

        postsRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        postsRecycler.setAdapter(mAdapter);

    }

    public String getListStrings (List<String> listString){
        String Strings = "";
        if(listString != null)
        for (String x:listString
             ) {

             Strings = Strings.concat(x+"\n") ;
        }


        return Strings;
    }

}
