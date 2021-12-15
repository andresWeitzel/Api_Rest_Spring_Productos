package com.api.productos.mypackages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.service.ProductoService;

@RestController
@RequestMapping("/v1")
public class ProductoController {
	
	//INYECCION DEL SERVICE
	@Autowired
	@Qualifier("ProductoService")
	ProductoService productoService;
	
	
	//--MÉTODOS HTTP--
	
	//METODO POST
	@PostMapping("/productos")
	public boolean agregarProducto(@RequestBody @Validated Producto producto) {
		return productoService.agregarProducto(producto);
	}
	
	//MÉTODO PUT
	@PutMapping("/productos")
	public boolean editarProducto(@RequestBody @Validated Producto producto) {
		return productoService.editarProducto(producto);
		
	}
	
	//MÉTODO DELETE
	@DeleteMapping("/productos/{id}")
	public boolean eliminarProducto(@PathVariable("id") int id) {
		return productoService.eliminarProducto(id);
			
		}
	


}
 