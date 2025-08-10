# 🐳 Docker Setup para Base de Datos

Este proyecto utiliza Docker para ejecutar la base de datos MySQL, permitiendo un desarrollo más limpio y consistente.

## 📋 Prerrequisitos

- Docker Desktop instalado
- Java 8 o superior
- Maven

## 🚀 Inicio Rápido

### 1. Levantar la Base de Datos

```bash
# Desde la raíz del proyecto
docker-compose up -d
```

### 2. Verificar que MySQL esté funcionando

```bash
# Ver logs del contenedor
docker-compose logs mysql

# Conectar a MySQL (opcional)
docker exec -it api_productos_mysql mysql -u api_user -p
# Contraseña: api_password
```

### 3. Ejecutar la Aplicación Spring Boot

```bash
# Desde la raíz del proyecto
mvn spring-boot:run
```

## 🔧 Configuración

### Variables de Entorno (Docker Compose)

- **MYSQL_ROOT_PASSWORD**: root
- **MYSQL_DATABASE**: db_api_productos
- **MYSQL_USER**: api_user
- **MYSQL_PASSWORD**: api_password
- **Puerto**: 3306

### Credenciales de la Aplicación

- **Usuario**: api_user
- **Contraseña**: api_password
- **Base de datos**: db_api_productos

## 📊 Datos Iniciales

Al levantar el contenedor, se crean automáticamente:

### Usuarios Disponibles

#### Administradores (Rol 3):
- **admin** / password
- **supervisor** / password  
- **manager** / password

#### Usuarios Regulares (Rol 2):
- **usuario1** / password
- **usuario2** / password
- **usuario3** / password
- **vendedor1** / password
- **vendedor2** / password

#### Usuarios de Solo Lectura (Rol 1):
- **lector1** / password
- **lector2** / password
- **invitado** / password
- **consultor** / password
- **analista** / password

#### Usuario Inactivo:
- **usuario_inactivo** / password (estado: false)

### Productos de Ejemplo (35 productos)

#### Categorías disponibles:
- **Laptops y Computadoras** (5 productos)
- **Periféricos** (5 productos)
- **Monitores** (5 productos)
- **Audio** (5 productos)
- **Almacenamiento** (5 productos)
- **Red y Conectividad** (5 productos)
- **Accesorios** (5 productos)

#### Ejemplos destacados:
- Laptop HP Pavilion - $899.99
- MacBook Air M1 - $1499.99
- Monitor 32" 4K Dell - $599.99
- Auriculares Noise Cancelling - $199.99
- SSD NVMe 1TB WD - $129.99

## 🛠️ Comandos Útiles

```bash
# Levantar servicios
docker-compose up -d

# Detener servicios
docker-compose down

# Ver logs
docker-compose logs -f mysql

# Reiniciar solo MySQL
docker-compose restart mysql

# Eliminar todo (incluyendo volúmenes)
docker-compose down -v

# Conectar a MySQL
docker exec -it api_productos_mysql mysql -u api_user -p db_api_productos
```

## 🔍 Troubleshooting

### Error de Conexión
Si la aplicación no puede conectarse a MySQL:

1. Verificar que el contenedor esté corriendo:
   ```bash
   docker ps
   ```

2. Verificar logs:
   ```bash
   docker-compose logs mysql
   ```

3. Verificar conectividad:
   ```bash
   telnet localhost 3306
   ```

### Reiniciar Base de Datos
```bash
docker-compose down
docker-compose up -d
```

## 📁 Estructura de Archivos

```
Api_Rest_Spring_Productos/
├── docker-compose.yml          # Configuración de Docker
├── mysql/
│   └── init/
│       └── 01-create-database.sql  # Script de inicialización
└── src/
    └── main/
        └── resources/
            └── application.properties  # Configuración de la app
```

## 🎯 Ventajas de esta Configuración

- ✅ **Aislamiento**: MySQL no contamina tu sistema local
- ✅ **Consistencia**: Mismo entorno en cualquier máquina
- ✅ **Facilidad**: Un comando para levantar la DB
- ✅ **Portabilidad**: Funciona en Windows, Mac, Linux
- ✅ **Desarrollo limpio**: No necesitas instalar MySQL localmente 