package com.api.productos.mypackages.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.converters.ProductoConverter;
import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ModeloProducto;
import com.api.productos.mypackages.repositories.interfaces.I_ProductoRepository;

@Service("ProductoService")
public class ProductoService {
	
	@Autowired
	@Qualifier("I_ProductoRepository")
	private I_ProductoRepository iProductoRepository;

	
	@Autowired
	@Qualifier("ProductoConverter")
	private ProductoConverter productoConvertidor;
	
	
	//MÉTODOS CRUD
	
	//INSERT
	public boolean agregarProducto(Producto producto) {
		
		try {
			
			if (producto == null) {
				
				return false;
					
			}else {
				
				iProductoRepository.save(producto);
				
				return true;
			
			}
		
			
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	//UPDATE
		public boolean editarProducto(Producto producto) {
			
			try {
				
				if ((producto == null) || (producto.getId() == 0)) {
					
					return false;
						
				}else {
					
					iProductoRepository.save(producto);
					
					return true;
				
				}
			
				
			}catch(Exception e) {
				return false;
			}
		}
	
	//DELETE
	public boolean eliminarProducto(int id) {
					
			try {
						
				if ((id == 0)) {
							
					return false;
								
				}else {
							
					Producto idProducto = iProductoRepository.findById(id);
							
					iProductoRepository.delete(idProducto);
					
					
					return true;
						
				}
					
						
				}catch(Exception e) {
						return false;
					}
				}
	
	
	//LISTA DE PRODUCTOS
	public ArrayList<ModeloProducto> listaProductos(){
		
		ArrayList<ModeloProducto> productos = null;
		
		iProductoRepository.findAll();
		
		return productos;
		
	}

}
