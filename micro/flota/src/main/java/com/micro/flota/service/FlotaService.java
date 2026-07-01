package com.micro.flota.service;

import com.micro.flota.client.CotizadorClient;
import com.micro.flota.client.VehiculoClient;
import com.micro.flota.dto.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlotaService {

    private final VehiculoClient vehiculoClient;
    private final CotizadorClient cotizadorClient;

    public FlotaService(VehiculoClient vehiculoClient, CotizadorClient cotizadorClient){
        this.vehiculoClient = vehiculoClient;
        this.cotizadorClient = cotizadorClient;
    }

    public String compararFlota(double distancia) {

        List<VehiculoDTO> vehiculos = vehiculoClient.obtenerVehiculos();

        VehiculoDTO mejor = null;
        double menorCosto = Double.MAX_VALUE;

        for (VehiculoDTO v : vehiculos) {
            CotizacionRequest req = new CotizacionRequest();
            req.setDistanciaKm(distancia);
            req.setTipo(v.getTipo());
            req.setKmPorGalon(v.getKmPorGalon());
            req.setCostoKwh(v.getCostoKwh());

            CotizacionResponse cot = cotizadorClient.cotizar(req);

            if (cot.getCostoTotal() < menorCosto) {
                menorCosto = cot.getCostoTotal();
                mejor = v;
            }
        }

        return "El mas economiuco es " + mejor.getMarca() + " " + mejor.getModelo() + " con costo " + menorCosto;
    }
}
