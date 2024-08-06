package edu.tienda.core.services;

import edu.tienda.core.domain.Producto;
import edu.tienda.core.persistance.entities.ProductoEntity;
import edu.tienda.core.persistance.respositories.ProductosRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("DB")
@ConditionalOnProperty(
        value = "productos.estrategia",
        havingValue = "EN_DB")
public class ProductoServiceDBImpl implements ProductoService {

    @Autowired
    private ProductosRespository productosRespository;

    public List<Producto> getProductos(){
        List<ProductoEntity> productosEntities = productosRespository.findAll();
        List<Producto> productos = new ArrayList<Producto>();

        for(ProductoEntity productoEntity : productosEntities){
            Producto producto = new Producto();
            producto.setId(productoEntity.getId());
            producto.setNombre(productoEntity.getNombre());
            producto.setPrecio(productoEntity.getPrecio());
            producto.setStock(productoEntity.getStock());
            productos.add(producto);
        }
        return productos;
    }

    @Override
    public void saveProducto(Producto producto) {
        ProductoEntity productoEntity = new ProductoEntity();
        productoEntity.setNombre(producto.getNombre());
        productoEntity.setPrecio(producto.getPrecio());
        productoEntity.setStock(producto.getStock());
        productosRespository.save(productoEntity);
    }
}
