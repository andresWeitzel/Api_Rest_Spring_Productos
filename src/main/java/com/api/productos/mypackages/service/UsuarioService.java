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
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.entities.Usuario;
import com.api.productos.mypackages.repositories.interfaces.I_UsuarioRepository;

@Service("UsuarioService")
public class UsuarioService implements UserDetailsService{


	// ========= INYECCIÓN DE DEPENDENCIAS ==========
	@Autowired
	@Qualifier("I_UsuarioRepository")
	private I_UsuarioRepository iUsuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = iUsuarioRepository.findByUsuario(username);
		
		return new User(usuario.getUsuario() , usuario.getContrasenia() , usuario.getEstado() 
				, usuario.getEstado() , usuario.getEstado() , usuario.getEstado() 
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
	
	
	
}
