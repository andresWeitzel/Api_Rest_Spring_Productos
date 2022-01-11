package com.api.productos.mypackages.repositories.interfaces;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.entities.Usuario;

@Repository("I_UsuarioRepository")
public interface I_UsuarioRepository extends JpaRepository<Usuario, Serializable>{

	public abstract Usuario findById(int id);

	public abstract Usuario findByUsuario(String usuario);
	
	public abstract Usuario findByContrasenia(String contrasenia);

	public abstract Usuario findByRol(byte rol);
	
	public abstract Usuario findByEstado(boolean estado);



	
}
