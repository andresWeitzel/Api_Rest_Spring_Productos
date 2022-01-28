package com.api.productos.mypackages.configurations;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import static java.util.Collections.emptyList;

public class JwtUtilConfiguration {
	
	
	// Método para crear el JWT y enviarlo al cliente en el header de la respuesta
    static void addAuthentication(HttpServletResponse res, String username) {

        String token = Jwts.builder()
            .setSubject(username)
                
            // Vamos a asignar un tiempo de expiracion de 10 minutos
            
            .setExpiration(new Date(System.currentTimeMillis() + 600000))
            
            // Hash con el que firmaremos la clave
            .signWith(SignatureAlgorithm.HS512, "UsuarioValidado")
            .compact();

        //agregamos al encabezado el token
        res.addHeader("Authorization", "Token: " + token);
    }

    // Método para validar el token enviado por el cliente
    static Authentication getAuthentication(HttpServletRequest request) {
        
        // Obtenemos el token que viene en el encabezado de la peticion
        String token = request.getHeader("Authorization");
        
        // si hay un token presente, entonces lo validamos
        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey("UsuarioValidado")
                    .parseClaimsJws(token.replace("Token:", "")) //este metodo es el que valida
                    .getBody()
                    .getSubject();

            // Recordamos que para las demás peticiones que no sean /login
            // no requerimos una autenticacion por username/password 
            // por este motivo podemos devolver un UsernamePasswordAuthenticationToken sin password
            return user != null ?
                    new UsernamePasswordAuthenticationToken(user, null, emptyList()) :
                    null;
        }
        return null;
    }

}
