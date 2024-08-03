package edu.tienda.core.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Producto {
    private Integer id;
    private String nombre;
    private Double precio;
    private Integer stock;

    public Producto() {
    }
}