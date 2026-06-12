package com.microservicios.demo.actividad4;

public class LibroElectronico extends RecursoDigital{

    protected int numeroPaginas;
    protected boolean tieneDRM;

    public LibroElectronico(String titulo, String autor, int anioPublicacion, String formato, double tamanioMB, int numeroPaginas, boolean tieneDRM) {
        super(titulo, autor, anioPublicacion, formato, tamanioMB);
        this.numeroPaginas = numeroPaginas;
        this.tieneDRM = tieneDRM;
    }

    @Override
    public String obtenerResumen() {
        return "Libro electronico: " + titulo
                + "\n Autor: " + autor
                + "\n Año publicación: " + anioPublicacion
                + "\n Formato: " + formato
                + "\n Tamaño MB: " + tamanioMB
                + "\n Numero de paginas: " + numeroPaginas
                + "\n Tiene DRM: " + tieneDRM
                + "\n";

    }
}
