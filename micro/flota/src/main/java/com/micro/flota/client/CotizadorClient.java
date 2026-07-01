package com.micro.flota.client;

import com.micro.flota.dto.CotizacionRequest;
import com.micro.flota.dto.CotizacionResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "COTIZADOR-SERVICE")
public interface CotizadorClient {

    @PostMapping("/api/cotizaciones")
    CotizacionResponse cotizar(@RequestBody CotizacionRequest request);

}
