package com.micro.vehiculo.service;

import com.micro.vehiculo.model.TipoVehiculo;
import com.micro.vehiculo.model.Vehiculo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class VehiculoService {

    private final List<Vehiculo> flota = new ArrayList<>();
    private final AtomicLong contadorId = new AtomicLong(1);

    // Carga inicial: los mismos vehiculos del Main original
    @PostConstruct
    public void cargarDatosIniciales() {
        Vehiculo kia = new Vehiculo();
        kia.setMarca("Kia"); kia.setModelo("Rio"); kia.setYear(2025);
        kia.setTipo(TipoVehiculo.COMBUSTION); kia.setSubtipo("Auto"); kia.setKmPorGalon(50);
        crear(kia);

        Vehiculo yamaha = new Vehiculo();
        yamaha.setMarca("Yamaha"); yamaha.setModelo("FZ 2.0"); yamaha.setYear(2023);
        yamaha.setTipo(TipoVehiculo.COMBUSTION); yamaha.setSubtipo("Moto"); yamaha.setKmPorGalon(98);
        crear(yamaha);

        Vehiculo byd = new Vehiculo();
        byd.setMarca("BYD"); byd.setModelo("Yuan Up"); byd.setYear(2026);
        byd.setTipo(TipoVehiculo.ELECTRICO);
        byd.setCapacidadBateria(400.0); byd.setNivelCarga(0.15); byd.setCostoKwh(80);
        crear(byd);
    }

    public List<Vehiculo> listarTodos() {
        return flota;
    }

    public Vehiculo buscarPorId(Long id) {
        return flota.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Vehiculo no encontrado: " + id));
    }

    public Vehiculo crear(Vehiculo vehiculo) {
        vehiculo.setId(contadorId.getAndIncrement());
        flota.add(vehiculo);
        return vehiculo;
    }

    public Vehiculo actualizar(Long id, Vehiculo datos) {
        Vehiculo v = buscarPorId(id);
        v.setMarca(datos.getMarca());
        v.setModelo(datos.getModelo());
        v.setYear(datos.getYear());
        v.setTipo(datos.getTipo());
        v.setSubtipo(datos.getSubtipo());
        v.setKmPorGalon(datos.getKmPorGalon());
        v.setCapacidadBateria(datos.getCapacidadBateria());
        v.setNivelCarga(datos.getNivelCarga());
        v.setCostoKwh(datos.getCostoKwh());
        return v;
    }

    public void eliminar(Long id) {
        flota.remove(buscarPorId(id));
    }
}
