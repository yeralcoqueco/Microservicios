package com.micro.flota.controller;

import com.micro.flota.dto.ComparacionFlota;
import com.micro.flota.service.FlotaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flota")
public class FlotaController {

    private final FlotaService service;

    public FlotaController(FlotaService service) {
        this.service = service;
    }

    @GetMapping("/comparar")
    public String comparar(@RequestParam double distancia) {
        return service.compararFlota(distancia);
    }
}
