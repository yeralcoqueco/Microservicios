package com.microservicios.demo.actividad3;

public class AutoElectrico extends Vehiculo implements VehiculoElectrico{

private double capacidadBateria;
private double nivelCarga;
private double costoKwh;

    public AutoElectrico(String marca, String modelo, int year, double capacidadBateria, double nivelCarga, double costoKwh) {
        super(marca, modelo, year);
        this.capacidadBateria = capacidadBateria;
        this.nivelCarga = nivelCarga;
        this.costoKwh = costoKwh;
    }


    @Override
    double calcularCostoViaje(double distancia) {
        double consumoporKm = 0.15;
        return distancia * consumoporKm * costoKwh;
    }

    @Override
    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    @Override
    public double getNivelCarga() {
        return nivelCarga;
    }

    @Override
    public void cargarBateria(double porcentaje) {
        nivelCarga += porcentaje;

    }
}
