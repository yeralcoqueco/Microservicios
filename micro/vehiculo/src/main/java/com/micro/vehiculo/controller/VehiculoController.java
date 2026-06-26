package com.micro.vehiculo.controller;

import com.micro.vehiculo.model.Vehiculo;
import com.micro.vehiculo.service.VehiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    private final VehiculoService service;

    public VehiculoController(VehiculoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vehiculo> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Vehiculo obtener(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<Vehiculo> crear(@RequestBody Vehiculo vehiculo) {
        return ResponseEntity.ok(service.crear(vehiculo));
    }

    @PutMapping("/{id}")
    public Vehiculo actualizar(@PathVariable Long id, @RequestBody Vehiculo datos) {
        return service.actualizar(id, datos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
