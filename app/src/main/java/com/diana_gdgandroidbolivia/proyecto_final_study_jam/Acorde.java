package com.diana_gdgandroidbolivia.proyecto_final_study_jam;


public class Acorde {
    private String nombre;
    private int foto;

    public Acorde(){

    }

    public Acorde(String nombre,int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
