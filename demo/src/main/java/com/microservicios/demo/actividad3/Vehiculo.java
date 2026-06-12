package com.microservicios.demo.actividad3;

public abstract class Vehiculo {

    String marca;
    String modelo;
    int year;

    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    abstract double calcularCostoViaje(double distancia);

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }
}
