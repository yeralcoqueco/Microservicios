package com.microservicios.demo.actividad4;

public abstract class RecursoBibliografico {

    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public RecursoBibliografico(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public abstract String obtenerResumen();
}
