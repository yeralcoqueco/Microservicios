package com.micro.flota.dto;

public class ResultadoViaje {

    private String marca;
    private String modelo;
    private double distancia;
    private double costo;

    public ResultadoViaje(String marca, String modelo, double distancia, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.distancia = distancia;
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getCosto() {
        return costo;
    }
}
