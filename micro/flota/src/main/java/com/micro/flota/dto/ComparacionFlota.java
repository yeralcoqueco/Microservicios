package com.micro.flota.dto;

import java.util.List;

public class ComparacionFlota {
    private List<ResultadoViaje> resultados;
    private ResultadoViaje vehiculoMasEconomico;

    public ComparacionFlota(List<ResultadoViaje> resultados, ResultadoViaje vehiculoMasEconomico) {
        this.resultados = resultados;
        this.vehiculoMasEconomico = vehiculoMasEconomico;
    }

    public List<ResultadoViaje> getResultados() {
        return resultados;
    }

    public ResultadoViaje getVehiculoMasEconomico() {
        return vehiculoMasEconomico;
    }
}
