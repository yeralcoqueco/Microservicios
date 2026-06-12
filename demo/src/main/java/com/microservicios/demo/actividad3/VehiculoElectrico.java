package com.microservicios.demo.actividad3;

public interface VehiculoElectrico{

    double getCapacidadBateria();
    double getNivelCarga();
    void cargarBateria(double porcentaje);
}
