package com.micro.cotizador.service;

import com.micro.cotizador.dto.CotizacionRequest;
import com.micro.cotizador.dto.CotizacionResponse;
import org.springframework.stereotype.Service;

@Service
public class CotizadorService {

    private static final double PRECIO_GASOLINA = 16000;
    private static final double CONSUMO_POR_KM = 0.15;

    public CotizacionResponse cotizar(CotizacionRequest req) {
        double distancia = req.getDistanciaKm();
        String tipo = req.getTipo().toUpperCase();
        double costo;

        switch (tipo) {
            case "COMBUSTION":
                costo = (distancia / req.getKmPorGalon()) * PRECIO_GASOLINA;
                break;
            case "ELECTRICO":
                costo = distancia * CONSUMO_POR_KM * req.getCostoKwh();
                break;
            default:
                throw new IllegalArgumentException("Tipo no valido: " + tipo);
        }

        return new CotizacionResponse(tipo, distancia, costo);
    }
}
