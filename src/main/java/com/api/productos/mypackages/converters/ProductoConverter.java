package com.api.productos.mypackages.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ProductoModel;

@Component("ProductoConverter")
public class ProductoConverter {
	
	
	
	
	public ArrayList<ProductoModel> convertirListaProducto(ArrayList<Producto> productos){
		
		ArrayList<ProductoModel> listaModeloProductos = new ArrayList<>();
	
		
		productos.forEach(objetoProducto -> listaModeloProductos.add(new ProductoModel(objetoProducto)));
		
		return listaModeloProductos;
	
	}
	
	
	
	public List<ProductoModel> convertirListaProducto(List<Producto> productos){
		
		List<ProductoModel> listaModeloProductos = new ArrayList<>();
	
		
		productos.forEach(objetoProducto -> listaModeloProductos.add(new ProductoModel(objetoProducto)));
		
		return listaModeloProductos;
	
	}
	
	
	

}
