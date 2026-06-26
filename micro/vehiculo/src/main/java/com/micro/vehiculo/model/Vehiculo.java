package com.micro.vehiculo.model;

public class Vehiculo {

    private Long id;
    private String marca;
    private String modelo;
    private int year;
    private TipoVehiculo tipo;

    private String subtipo;       // "Auto" / "Moto"
    private double kmPorGalon;

    private double capacidadBateria;
    private double nivelCarga;
    private double costoKwh;

    public Vehiculo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }

    public double getKmPorGalon() {
        return kmPorGalon;
    }

    public void setKmPorGalon(double kmPorGalon) {
        this.kmPorGalon = kmPorGalon;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(double nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public double getCostoKwh() {
        return costoKwh;
    }

    public void setCostoKwh(double costoKwh) {
        this.costoKwh = costoKwh;
    }
}
