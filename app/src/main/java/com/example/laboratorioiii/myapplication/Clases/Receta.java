package com.example.laboratorioiii.myapplication.Clases;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ivan on 27/5/2016.
 */
public class Receta {

    public Receta(){

    }


    public Receta(String titulo,String autor,List<String> pasos,List<String> ingredientes){
        this.titulo = titulo;
        this.autor = autor;
        this.pasos=pasos;
        this.ingredientes=ingredientes;
    }

    private String titulo;

    private List<String> ingredientes;

    private List<String> pasos;

    private String autor;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getPasos() {
        return pasos;
    }

    public void setPasos(List<String> pasos) {
        this.pasos = pasos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> postValues = new HashMap<>();
        postValues.put("titulo", titulo);
        postValues.put("autor", autor);
        postValues.put("autor", pasos);
        postValues.put("autor", ingredientes);

        return postValues;
    }


}
