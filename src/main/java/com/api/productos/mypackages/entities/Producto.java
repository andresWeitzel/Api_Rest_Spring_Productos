package com.api.productos.mypackages.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="Producto")
@Entity
public class Producto {
	


	private int id;

	private String codigo;
	
	private String nombre;
	
	private String precio;
	
	
	public Producto() {
	}
	

	public Producto(String codigo, String nombre, String precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	} 
	

	public Producto(int id, String codigo, String nombre, String precio) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
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
