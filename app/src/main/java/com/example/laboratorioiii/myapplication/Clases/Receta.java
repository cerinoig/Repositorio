package com.example.laboratorioiii.myapplication.Clases;

import java.util.List;

/**
 * Created by Ivan on 27/5/2016.
 */
public class Receta {

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
}
