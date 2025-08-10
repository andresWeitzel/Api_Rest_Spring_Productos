package com.api.productos.mypackages.configurations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoginResponse {
    private boolean success;
    private String token;
    private String usuario;
    private int rol;
    private long expiresIn;
    private String message;
    private String timestamp;

    public LoginResponse() {
    }

    public LoginResponse(boolean success, String token, String usuario, int rol, long expiresIn, String message) {
        this.success = success;
        this.token = token;
        this.usuario = usuario;
        this.rol = rol;
        this.expiresIn = expiresIn;
        this.message = message;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // Getters y Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
} 