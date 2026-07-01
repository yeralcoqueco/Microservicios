package com.micro.flota.client;

import com.micro.flota.dto.VehiculoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "VEHICULO-SERVICE")
public interface VehiculoClient {
        @GetMapping("/api/vehiculos")
        List<VehiculoDTO> obtenerVehiculos();
}
