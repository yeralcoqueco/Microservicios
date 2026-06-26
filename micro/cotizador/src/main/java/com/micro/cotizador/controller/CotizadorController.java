package com.micro.cotizador.controller;

import com.micro.cotizador.dto.CotizacionRequest;
import com.micro.cotizador.dto.CotizacionResponse;
import com.micro.cotizador.service.CotizadorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cotizaciones")
public class CotizadorController {

    private final CotizadorService service;

    public CotizadorController(CotizadorService service) {
        this.service = service;
    }

    @PostMapping
    public CotizacionResponse cotizar(@RequestBody CotizacionRequest req) {
        return service.cotizar(req);
    }
}