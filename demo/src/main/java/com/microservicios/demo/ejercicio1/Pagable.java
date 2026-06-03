package com.microservicios.demo.ejercicio1;

public  interface Pagable {

    double calcularPago();

    double aplicarDescuento(double porcentaje);

    String descripcion();
}