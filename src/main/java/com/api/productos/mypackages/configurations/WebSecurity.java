package com.api.productos.mypackages.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.api.productos.mypackages.service.UsuarioService;

@Configuration
@EnableWebSecurity
public class WebSecurity {

	// ========= INYECCIÓN DE DEPENDENCIAS ==========
	@Autowired
	@Qualifier("UsuarioService")
	private UsuarioService usuarioService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		// Usar BCryptPasswordEncoder para contraseñas codificadas
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}

	@Bean
	public org.springframework.security.authentication.dao.DaoAuthenticationProvider authenticationProvider() {
		org.springframework.security.authentication.dao.DaoAuthenticationProvider authProvider = new org.springframework.security.authentication.dao.DaoAuthenticationProvider();
		authProvider.setUserDetailsService(usuarioService);
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authenticationProvider(authenticationProvider())
			.authorizeRequests()
				.antMatchers("/login", "/test/**").permitAll()
				.anyRequest().authenticated()
			.and()
			.addFilterBefore(createLoginFilter(http), UsernamePasswordAuthenticationFilter.class)
			.addFilterBefore(new JwtFilterConfiguration(),
					UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
	}
	
	private LoginFilterConfiguration createLoginFilter(HttpSecurity http) throws Exception {
		LoginFilterConfiguration loginFilter = new LoginFilterConfiguration("/login", authenticationManager(http.getSharedObject(AuthenticationConfiguration.class)));
		loginFilter.setUsuarioService(usuarioService);
		return loginFilter;
	}
}
