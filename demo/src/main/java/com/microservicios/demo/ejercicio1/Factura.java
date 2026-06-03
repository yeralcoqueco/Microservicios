package com.microservicios.demo.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private String numeroFactura;
    private String cliente;
    private List<Pagable> items;

    public Factura(String numeroFactura, String cliente){
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(Pagable item){
        this.items.add(item);
        System.out.println("Item agregado" + item.descripcion());
    }

    public double calcularGrandTotal(){
        double grandTotal = (double)0.0F;

        for(Pagable item : items){
            grandTotal += item.calcularPago();
        }
        return grandTotal;
    }

    public void imprimirFactura(){
        System.out.println("\n |--------------------------|");
        System.out.println("\n |        FACTURA           |");
        System.out.println("\n |--------------------------|");
        System.out.println("\n Número de factura: " + this.numeroFactura);
        System.out.println("\n Cliente: " + this.cliente);
        System.out.println("\n Items: ");

        for(Pagable item : items){
            System.out.println("\n - " + item.descripcion() + ": $" + item.calcularPago());
        }
        System.out.println("\n Total a pagar: $: " + calcularGrandTotal());
    }

    public void serializarItems(){
        System.out.println("\n Serializando items de la factura... ");
        for(Pagable item : this.items){
            if(item instanceof  Serializable){
                System.out.println(" " + ((Serializable) item).serializar());
            }
        }
    }

    public List<Pagable> getItems(){
        return this.items;
    }

    public String getNumeroFactura(){
        return this.numeroFactura;
    }

    public String getCliente(){
        return this.cliente;
    }

}
