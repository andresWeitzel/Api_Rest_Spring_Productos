 package com.api.productos.mypackages.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.entities.Usuario;
import com.api.productos.mypackages.repositories.interfaces.I_UsuarioRepository;

@Service("UsuarioService")
public class UsuarioService implements UserDetailsService{


	// ========= INYECCIÓN DE DEPENDENCIAS ==========
	@Autowired
	@Qualifier("I_UsuarioRepository")
	private I_UsuarioRepository iUsuarioRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("Intentando cargar usuario: " + username);
		
		Usuario usuario = iUsuarioRepository.findByUsuario(username);
		
		if (usuario == null) {
			System.out.println("Usuario no encontrado: " + username);
			throw new UsernameNotFoundException("Usuario no encontrado: " + username);
		}
		
		System.out.println("Usuario encontrado: " + usuario.getUsuario() + ", Estado: " + usuario.getEstado());
		System.out.println("Contraseña en BD: " + usuario.getContrasenia());
		System.out.println("Rol: " + usuario.getRol());
		
		// Usar PasswordEncoder para validar contraseñas codificadas
		return new User(usuario.getUsuario(), usuario.getContrasenia(), usuario.getEstado() 
				, usuario.getEstado(), usuario.getEstado(), usuario.getEstado() 
				, obtenerPermisos(usuario.getRol()));
	}
	
	public List<GrantedAuthority> obtenerPermisos(byte rol){
		
		String roles[] = {"LECTURA","USUARIO","ADMINISTRADOR"};
		
		List<GrantedAuthority> auths = new ArrayList();
		
		for(int i=0 ; i < rol ; i++) {
			auths.add(new SimpleGrantedAuthority(roles[i]));
		}
		
		return auths;
	}
	
	// Método para obtener usuario por username
	public Usuario getUsuarioByUsername(String username) {
		return iUsuarioRepository.findByUsuario(username);
	}
	
	
}
