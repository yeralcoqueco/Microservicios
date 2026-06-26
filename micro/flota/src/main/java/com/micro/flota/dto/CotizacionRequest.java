package com.micro.flota.dto;

public class CotizacionRequest {

    private double distanciaKm;
    private String tipo;
    private double kmPorGalon;
    private double costoKwh;

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKmPorGalon() {
        return kmPorGalon;
    }

    public void setKmPorGalon(double kmPorGalon) {
        this.kmPorGalon = kmPorGalon;
    }

    public double getCostoKwh() {
        return costoKwh;
    }

    public void setCostoKwh(double costoKwh) {
        this.costoKwh = costoKwh;
    }
}
