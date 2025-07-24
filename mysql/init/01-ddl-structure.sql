-- =====================================================
-- DDL - Data Definition Language
-- Estructura de la base de datos para API REST Productos
-- =====================================================

-- Crear base de datos si no existe
CREATE DATABASE IF NOT EXISTS db_api_productos;
USE db_api_productos;

-- Crear tabla de usuarios
CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(255) UNIQUE NOT NULL,
    contrasenia VARCHAR(255) NOT NULL,
    rol TINYINT NOT NULL DEFAULT 1,
    estado BOOLEAN NOT NULL DEFAULT TRUE
);

-- Crear tabla de productos
CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    precio FLOAT NOT NULL
);

-- Crear índices para optimizar consultas
CREATE INDEX idx_usuarios_usuario ON usuarios(usuario);
CREATE INDEX idx_usuarios_rol ON usuarios(rol);
CREATE INDEX idx_usuarios_estado ON usuarios(estado);
CREATE INDEX idx_productos_codigo ON productos(codigo);
CREATE INDEX idx_productos_nombre ON productos(nombre); 