package com.microservicios.demo.ejercicio1;

public class Main {
    public Main(){
    }

    public static void main(String[] args){
        System.out.println("Ejercicio 4: Factura con Polimorfismo y Serialización");

        Producto laptop = new Producto("Laptop", (double) 1200.00F, 2);
        Producto teclado = new Producto("Teclado", (double) 1500.00F, 4);
        Producto monitor = new Producto("Monitor", (double) 5200.00F, 2);
        Servicio soporte = new Servicio("Soporte Técnico", (double) 300.00F, 2);
        Servicio desarrollo = new Servicio("Desarrollo de software", (double) 500.00F, 2);

        Factura factura = new Factura("F001", "Dana Garcia");
        factura.agregarItem(laptop);
        factura.agregarItem(teclado);
        factura.agregarItem(monitor);
        factura.agregarItem(soporte);
        factura.agregarItem(desarrollo);
        factura.imprimirFactura();;
        factura.serializarItems();

        Pagable [] elementos = new Pagable[]{laptop, teclado, monitor, soporte, desarrollo};

        for(Pagable elemento : elementos){
            System.out.println("\nDescripción " + elemento.descripcion());
            System.out.println("\nPago a realizar " + elemento.calcularPago());
        }
    }
}
