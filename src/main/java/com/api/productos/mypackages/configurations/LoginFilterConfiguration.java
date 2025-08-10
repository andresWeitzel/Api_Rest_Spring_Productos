package com.api.productos.mypackages.configurations;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.api.productos.mypackages.service.UsuarioService;
import com.api.productos.mypackages.entities.Usuario;

public class LoginFilterConfiguration extends AbstractAuthenticationProcessingFilter{

	private UsuarioService usuarioService;

	  public LoginFilterConfiguration(String url, AuthenticationManager authManager) {
	        super(new AntPathRequestMatcher(url));
	        setAuthenticationManager(authManager);
	    }
	    
	    public void setUsuarioService(UsuarioService usuarioService) {
	        this.usuarioService = usuarioService;
	    }

	  @Override
	    public Authentication attemptAuthentication(
	            HttpServletRequest req, HttpServletResponse res)
	            throws AuthenticationException, IOException, ServletException {

	        // obtenemos el body de la peticion que asumimos viene en formato JSON
	        InputStream body = req.getInputStream();

	        //Leemos los valores del Json (usuario y contraseña)
	        UsuarioConfiguration user = new ObjectMapper().readValue(body, UsuarioConfiguration.class);

	        // Finalmente autenticamos
	        // Spring comparará el user/password recibidos
	        // contra el que definimos en la clase SecurityConfig
	        return getAuthenticationManager().authenticate(
	                new UsernamePasswordAuthenticationToken(
	                        user.getUsuario(),
	                        user.getContrasenia(),
	                        Collections.emptyList()
	                )
	        );
	    }
	  
	  @Override
	    protected void successfulAuthentication(
	            HttpServletRequest req,
	            HttpServletResponse res, FilterChain chain,
	            Authentication auth) throws IOException, ServletException {

	        // Si la autenticacion fue exitosa, generamos el token
	        String token = JwtUtilConfiguration.generateToken(auth.getName());
	        
	        // Obtenemos información del usuario desde la base de datos
	        String username = auth.getName();
	        int rol = 3; // Por defecto
	        long expiresIn = 600000; // 10 minutos en milisegundos
	        
	        // Intentamos obtener el rol real del usuario desde la BD
	        try {
	            if (usuarioService != null) {
	                Usuario usuario = usuarioService.getUsuarioByUsername(username);
	                if (usuario != null) {
	                    rol = usuario.getRol();
	                }
	            }
	        } catch (Exception e) {
	            // Si hay error, mantenemos el rol por defecto
	            System.out.println("Error obteniendo rol del usuario: " + e.getMessage());
	        }
	        
	        // Creamos la respuesta con el token en el body
	        LoginResponse loginResponse = new LoginResponse(
	            true, 
	            token, 
	            username, 
	            rol, 
	            expiresIn, 
	            "Login exitoso"
	        );
	        
	        // Configuramos la respuesta
	        res.setStatus(HttpServletResponse.SC_OK);
	        res.setContentType("application/json");
	        res.setCharacterEncoding("UTF-8");
	        
	        // Convertimos la respuesta a JSON y la escribimos en el body
	        ObjectMapper mapper = new ObjectMapper();
	        String jsonResponse = mapper.writeValueAsString(loginResponse);
	        res.getWriter().write(jsonResponse);
	    }

	  @Override
	    protected void unsuccessfulAuthentication(
	            HttpServletRequest req,
	            HttpServletResponse res,
	            AuthenticationException failed) throws IOException, ServletException {

	        res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	        res.setContentType("application/json");
	        res.getWriter().write("{\"error\": \"Authentication failed\", \"message\": \"" + failed.getMessage() + "\"}");
	    }

}
