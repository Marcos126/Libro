package edu.tienda.core.domain;

public class Producto {
    private Integer id;
    private String nombre;
    private Double precio;
    private Integer stock;


    public Producto(){
    }

    public Producto(Integer id, String nombre, Double precio, Integer stock){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    

    public void setPrecio(Double precio){
        this.precio = precio;
    }
    public Double getPrecio(){
        return this.precio;
    }

    public void setStock(Integer stock){
        this.stock = stock;
    }
    public Integer getStock(){
        return this.stock;
    }

}
