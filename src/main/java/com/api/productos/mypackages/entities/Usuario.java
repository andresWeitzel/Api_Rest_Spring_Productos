package com.api.productos.mypackages.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{
	
	@GeneratedValue
	@Id
	@Column(name="id" , unique= true)
	private int id;

	@Column(name="usuario" , unique= true)
	private String usuario;
	
	
	@Column(name="contrasenia")
	private String contrasenia;

	@Column(name="rol")
	private byte rol;

	@Column(name="estado")
	private boolean estado;
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public byte getRol() {
		return rol;
	}

	public void setRol(byte rol) {
		this.rol = rol;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", rol=" + rol
				+ ", estado=" + estado + "]";
	}
	
	
	
	

}
