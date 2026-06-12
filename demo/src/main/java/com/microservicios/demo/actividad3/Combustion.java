package com.microservicios.demo.actividad3;

public class Combustion extends  Vehiculo{

    private double kmPorGalon;
    private String tipoVehiculo;

    public Combustion(String marca, String modelo, int year, String tipoVehiculo, double kmPorGalon) {
        super(marca, modelo, year);
        this.kmPorGalon = kmPorGalon;
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    double calcularCostoViaje(double distancia) {
        double precioGasolina = 16000;
        return (distancia / kmPorGalon) * precioGasolina;
    }
}
