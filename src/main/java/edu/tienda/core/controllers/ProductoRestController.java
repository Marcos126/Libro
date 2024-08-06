package edu.tienda.core.controllers;


import edu.tienda.core.domain.Producto;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.tienda.core.configurations.ConfigurationParameters;
import edu.tienda.core.services.ProductoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/tienda/productos")
public class ProductoRestController{

    @Qualifier("DB")
    @Autowired
    private ProductoService productoService;

    private ConfigurationParameters configurationParameters;

    @GetMapping()
    public ResponseEntity<?> getProducts(){
        return ResponseEntity.ok(productoService.getProductos());
    }

    @PostMapping()
    public ResponseEntity<?> addProduct(@RequestBody Producto producto){
        productoService.saveProducto(producto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/fake-productos")
    public ResponseEntity<?> fakeProductsAPI(){
        List<Producto> productos = new ArrayList<>(Arrays.asList(
                new Producto(1,"Camiseta Juventus", 1200.0,4),
                new Producto(2,"Camiseta River Plate", 1000.0,4),
                new Producto(3,"Camiseta Boca Juniors", 900.0,4)
        ));
        return ResponseEntity.ok(productos);
    }



}
