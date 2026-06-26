package com.micro.flota.service;

import com.micro.flota.dto.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlotaService {

    private final RestTemplate restTemplate;
    private final String vehiculoUrl = "http://localhost:8081/api/vehiculos";
    private final String cotizadorUrl = "http://localhost:8082/api/cotizaciones";

    public FlotaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ComparacionFlota compararFlota(double distancia) {

        VehiculoDTO[] flota = restTemplate.getForObject(vehiculoUrl, VehiculoDTO[].class);
        if (flota == null || flota.length == 0) {
            throw new RuntimeException("No hay vehiculos en la flota");
        }

        List<ResultadoViaje> resultados = new ArrayList<>();
        ResultadoViaje mejor = null;
        double menorCosto = Double.MAX_VALUE;

        for (VehiculoDTO v : flota) {
            CotizacionRequest req = new CotizacionRequest();
            req.setDistanciaKm(distancia);
            req.setTipo(v.getTipo());
            req.setKmPorGalon(v.getKmPorGalon());
            req.setCostoKwh(v.getCostoKwh());

            CotizacionResponse cot =
                    restTemplate.postForObject(cotizadorUrl, req, CotizacionResponse.class);

            ResultadoViaje r = new ResultadoViaje(
                    v.getMarca(), v.getModelo(), distancia, cot.getCostoTotal());
            resultados.add(r);

            if (cot.getCostoTotal() < menorCosto) {
                menorCosto = cot.getCostoTotal();
                mejor = r;
            }
        }

        return new ComparacionFlota(resultados, mejor);
    }
}
