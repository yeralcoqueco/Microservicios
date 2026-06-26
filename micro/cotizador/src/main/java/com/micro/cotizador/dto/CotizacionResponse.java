package com.micro.cotizador.dto;

public class CotizacionResponse {
    private String tipo;
    private double distanciaKm;
    private double costoTotal;

    public CotizacionResponse(String tipo, double distanciaKm, double costoTotal) {
        this.tipo = tipo;
        this.distanciaKm = distanciaKm;
        this.costoTotal = costoTotal;
    }

    public String getTipo() {
        return tipo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
}
