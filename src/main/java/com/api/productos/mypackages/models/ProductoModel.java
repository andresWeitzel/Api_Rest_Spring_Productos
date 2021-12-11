package com.api.productos.mypackages.models;

import com.api.productos.mypackages.entities.Producto;

public class ProductoModel {

	
		private int id;

		private String codigo;
		
		private String nombre;
		
		private String precio;
		
		
		public ProductoModel() {
		}
		

		public ProductoModel(String codigo, String nombre, String precio) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
		} 
		

		public ProductoModel(int id, String codigo, String nombre, String precio) {
			super();
			this.id = id;
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
		}
		
		/*
		 * @version 1.0
		 * 
		 * Instancia de la clase-entidad Producto
		 * @param producto
		 * */
		public ProductoModel(Producto producto) {
			this.id = producto.getId();
			this.nombre = producto.getNombre();
			this.codigo = producto.getCodigo();
			this.precio = producto.getPrecio();
			
		}




		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getPrecio() {
			return precio;
		}

		public void setPrecio(String precio) {
			this.precio = precio;
		}
		
		
		

		@Override
		public String toString() {
			return "Producto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
		}
		

	}



