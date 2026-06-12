package com.microservicios.demo.actividad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Combustion("Kia", "Rio", 2025, "Auto" ,50));
        flota.add(new Combustion("Yamaha", "FZ 2.0", 2023, "Moto" ,98));
        flota.add(new AutoElectrico("BYD", "Yuan Up", 2026,400.0, 0.15, 80));

        double distancia = 250;

        Vehiculo mejorVehiculo = null;
        double menorCosto = Double.MAX_VALUE;

        for (Vehiculo vehiculo : flota) {
            double costo = vehiculo.calcularCostoViaje(distancia);

            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " Distancia -> " + distancia + " Costo -> " + costo);

            if (costo < menorCosto) {
                menorCosto = costo;
                mejorVehiculo = vehiculo;
            }
        }

        System.out.println("\nVehiculo mas economico -> "  + mejorVehiculo.getMarca() + " " + mejorVehiculo.getModelo() + " " + menorCosto);

    }
}
