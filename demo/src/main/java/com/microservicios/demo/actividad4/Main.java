package com.microservicios.demo.actividad4;

public class Main {

    public static void main(String[] args){

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarRecurso(new LibroElectronico("La Isla de los Pinguinos", "Anatole France", 1908, "EPUB", 5, 246, true));
        biblioteca.agregarRecurso(new LibroElectronico("Cuentos Extraordinarios", "Edgar Allan Poe", 1842, "PDF", 15, 1001, false));
        biblioteca.agregarRecurso(new LibroElectronico("Cien años de soledad", "Gabriel Garcia Marquez", 1967, "EPUB", 9, 500, true));
        biblioteca.agregarRecurso(new RecursoDigital("Recurso", "Autor", 2026, "PDF", 7));

        System.out.println(" ** Biblioteca ** ");

        biblioteca.mostrarRecurso();

        LibroElectronico libroMasAntiguo = biblioteca.buscarLibroMasAntiguo();
        System.out.println("\n Libro mas antiguo: " + libroMasAntiguo.obtenerResumen());


    }
}
