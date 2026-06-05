package com.microservicios.demo.ejercicio2;

public class Servicio implements Pagable {
    private String descripcion;
    private double precioHora;
    private double horasTrabajadas;

    public Servicio(String d, double ph, double h) {
        this.descripcion = d;
        this.precioHora = ph;
        this.horasTrabajadas = h;
    }

    @Override
    public double calcularTotal() {
        return precioHora * horasTrabajadas;
    }

    @Override
    public double aplicarDescuento(double pct) {
        return calcularTotal() * (1 - pct);
    }

}
