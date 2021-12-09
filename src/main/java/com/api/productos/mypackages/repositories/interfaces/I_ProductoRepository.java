package com.api.productos.mypackages.repositories.interfaces;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.productos.mypackages.entities.Producto;


@Repository("I_ProductoRepository")
public interface I_ProductoRepository extends JpaRepository<Producto, Serializable>{

//Hay Métodos que JPA ya los tiene desarrollados, se pueden crear para tener
//una manipulación más especifica a la hora de usarlos en el service	

public abstract Producto findById(int id);

public abstract Producto findByCodigo(String codigo);

public abstract List<Producto> findByNombre(String nombre);

public abstract List<Producto> findByPrecio(double precio);

public abstract List<Producto> findAll();

	
	
}
