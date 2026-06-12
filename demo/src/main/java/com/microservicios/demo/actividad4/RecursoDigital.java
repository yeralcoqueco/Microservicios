package com.microservicios.demo.actividad4;

public class RecursoDigital extends RecursoBibliografico{

    protected String formato;
    protected double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anioPublicacion, String formato, double tamanioMB) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    @Override
    public String obtenerResumen() {
        return "Recurso digital: " + titulo
                + "\n Autor: " + autor
                + "\n Año publicación: " + anioPublicacion
                + "\n Formato: " + formato
                + "\n tamaño MB: " + tamanioMB;
    }
}
