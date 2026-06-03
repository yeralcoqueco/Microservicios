package com.microservicios.demo.ejercicio1;

public  interface Pagable {

    double CalcularPago();

    double aplicarDescuento(double porcentaje);

    String descripcion();
}