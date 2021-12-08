package com.api.productos.mypackages.converters;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ModeloProducto;

@Component("ProductoConverter")
public class ProductoConverter {
	
	
	
	
	public ArrayList<ModeloProducto> convertirListaProducto(ArrayList<Producto> productos){
		
		ArrayList<ModeloProducto> listaModeloProductos = new ArrayList<>();
	
		
		productos.forEach(objetoProducto -> listaModeloProductos.add(new ModeloProducto(objetoProducto)));
		
		return listaModeloProductos;
	
	}
	
	
	

}
