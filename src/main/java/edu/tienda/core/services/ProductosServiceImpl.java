 package edu.tienda.core.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import edu.tienda.core.domain.Producto;

@Lazy
@Service("MEMORY")
@ConditionalOnProperty(
        value = "productos.estrategia",
        havingValue = "EN_MEMORIA")

public class ProductosServiceImpl implements ProductoService{

     private List<Producto> productos = new ArrayList<>(Arrays.asList(
         new Producto(1,"Smart TV",9000.0,3),
         new Producto(2,"Pc Notebook",15000.0,10),
         new Producto(1,"Tablet",8000.0,5)
         
     ));

     public List<Producto> getProductos(){
         return productos;
     }
    
     public ProductosServiceImpl(){
         System.out.println("Se esta construyendo un objeto de la clase ProductosServiceImpl");
     }

    @Override
    public void saveProducto(Producto producto) {

    }

 }

 
