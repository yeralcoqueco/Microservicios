package com.microservicios.demo.actividad4;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<RecursoDigital> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(RecursoDigital recurso){
        recursos.add(recurso);
    }

    public void mostrarRecurso(){
        for(RecursoDigital recurso : recursos){
            System.out.println(recurso.obtenerResumen());
        }
    }

    public LibroElectronico buscarLibroMasAntiguo(){

        LibroElectronico masAntiguo = null;

        for (RecursoDigital recurso : recursos){
            if(recurso instanceof LibroElectronico){
                LibroElectronico libro = (LibroElectronico) recurso;

                if(masAntiguo == null || libro.getAnioPublicacion() < masAntiguo.getAnioPublicacion()){
                    masAntiguo = libro;
                }
            }
        }

        return masAntiguo;
    }
}
