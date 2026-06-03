package com.microservicios.demo.ejercicio1;

public class Servicio implements Pagable, Serializable {

    private String descripcion;
    private double precioHora;
    private double horasTrabajadas;

    public Servicio(String descripcion, double precioHora, int horasTrabajadas){
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularTotal(){
        return this.precioHora = (double) this.horasTrabajadas;
    }

    public double calcularPago() {
        return 0;
    }

    public double aplicarDescuento(double porcentaje){
        double total = this.calcularTotal();
        return total - (total * porcentaje / 100);
    }

    public String descripcion() {
        return String.format("Servicio: %s | Precio/hora: $%.2f | Horas: %.1f | Total con Descuento: $%.2f", this.descripcion, this.precioHora, this.horasTrabajadas, this.aplicarDescuento(10));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public String serializar () {
        return String.format("{tipo: 'Servicio', descripcion: '%s', precioHora:%.2f, horas:%.1f, total:%.2f}",
                descripcion, precioHora, horasTrabajadas, calcularTotal());
    }

    public String toString() {
        return this.descripcion();
    }
}
