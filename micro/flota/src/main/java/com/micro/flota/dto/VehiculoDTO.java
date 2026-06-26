package com.micro.flota.dto;

public class VehiculoDTO {

    private Long id;
    private String marca;
    private String modelo;
    private int year;
    private String tipo;
    private double kmPorGalon;
    private double costoKwh;

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
