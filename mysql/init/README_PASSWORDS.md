# Contraseñas de Usuarios de Ejemplo

## Información de Acceso

Todas las contraseñas son **alfanuméricas de 10 caracteres** (letras, números y símbolos) en **texto plano** para facilitar el desarrollo.

**⚠️ IMPORTANTE:** Estas contraseñas están en texto plano solo para desarrollo. En producción se deben usar hashes BCrypt.

## Usuarios Disponibles

### Administradores (Rol 3)
- **admin** - `Admin2024!` - Administrador principal
- **supervisor** - `Super2024!` - Supervisor del sistema
- **manager** - `Manager24!` - Gerente de operaciones

### Usuarios Regulares (Rol 2)
- **usuario1** - `User1Pass!` - Usuario regular 1
- **usuario2** - `User2Pass!` - Usuario regular 2
- **usuario3** - `User3Pass!` - Usuario regular 3
- **vendedor1** - `Vende2024!` - Vendedor 1
- **vendedor2** - `Vende2025!` - Vendedor 2

### Usuarios de Solo Lectura (Rol 1)
- **lector1** - `Lector2024!` - Lector 1
- **lector2** - `Lector2025!` - Lector 2
- **invitado** - `Invit2024!` - Usuario invitado
- **consultor** - `Consul2024!` - Consultor
- **analista** - `Anali2024!` - Analista

### Usuario Inactivo
- **usuario_inactivo** - `Inact2024!` - Usuario deshabilitado (estado: false)

## Características de las Contraseñas

- ✅ **Alfanuméricas**: Letras (mayúsculas y minúsculas) + números + símbolos
- ✅ **10 caracteres** exactos
- ✅ **Únicas** para cada usuario
- ✅ **Fáciles de recordar** (patrón: Palabra + Año + !)
- ✅ **Texto plano** para desarrollo (sin hash)

## Ejemplos de Uso en API

### Login Request:
```json
{
  "usuario": "admin",
  "contrasenia": "Admin2024!"
}
```

### Otros ejemplos:
- `supervisor` / `Super2024!`
- `usuario1` / `User1Pass!`
- `lector1` / `Lector2024!`

## Notas de Seguridad

⚠️ **ADVERTENCIA DE DESARROLLO:**
- Estas contraseñas están en **texto plano** solo para facilitar el desarrollo
- **NO usar en producción**
- En producción, cada usuario debe tener una contraseña única y segura con hash BCrypt
- Las contraseñas cumplen con requisitos de complejidad (alfanuméricas + símbolos)
- Se recomienda cambiar las contraseñas después del primer acceso

## 🔐 Generación de Hashes BCrypt

Para generar hashes BCrypt seguros para las contraseñas, puedes usar estos generadores online:

### 🌐 Generadores de Hashes BCrypt Online:

#### **1. BCrypt Generator (Recomendado):**
- **URL:** https://bcrypt-generator.com/
- **Características:** Interfaz simple, múltiples rondas de coste

#### **2. BCrypt Hash Generator:**
- **URL:** https://bcrypt.online/
- **Características:** Generación rápida, múltiples opciones

#### **3. BCrypt Calculator:**
- **URL:** https://bcryptcalculator.com/
- **Características:** Calculadora avanzada con opciones de configuración

### 📋 Pasos para Generar Hashes:

1. **Ve a cualquiera de los enlaces anteriores**
2. **Ingresa la contraseña** (ejemplo: `Admin2024!`)
3. **Copia el hash generado** (empieza con `$2a$10$` o `$2a$12$`)
4. **Reemplaza en el archivo SQL** (`02-dml-data.sql`)

### 🎯 Ejemplo de Uso:

#### Contraseña Original:
```
Admin2024!
```

#### Hash BCrypt Generado:
```
$2a$12$EGKzUPWUeJpc2CyicZo/heK630sRFMFX.UC1XQe3xQBlAwcDjIffC
```

#### En el archivo SQL:
```sql
INSERT INTO usuarios (usuario, contrasenia, rol, estado) VALUES
('admin', '$2a$12$EGKzUPWUeJpc2CyicZo/heK630sRFMFX.UC1XQe3xQBlAwcDjIffC', 3, true);
```

### ⚙️ Configuración de Spring Security:

La aplicación está configurada para usar `BCryptPasswordEncoder`:

```java
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}
```

### 🔄 Actualización de Contraseñas:

1. **Genera el hash BCrypt** para cada contraseña
2. **Actualiza el archivo** `mysql/init/02-dml-data.sql`
3. **Recrea el contenedor Docker:**
   ```bash
   docker-compose down
   docker-compose up -d
   ```
4. **Prueba el login** con las nuevas contraseñas

### 🐳 Comandos de Docker para Gestión de Base de Datos

#### **Recrear Base de Datos Completa (Recomendado para cambios en SQL):**
```bash
# Detener contenedores y eliminar volúmenes (datos persistentes)
docker-compose down -v

# Levantar contenedores con datos frescos
docker-compose up -d
```

#### **Reiniciar Solo Contenedores (Mantiene datos):**
```bash
# Detener contenedores
docker-compose down

# Levantar contenedores
docker-compose up -d
```

#### **Verificar Estado de Contenedores:**
```bash
# Ver contenedores corriendo
docker ps

# Ver logs del contenedor MySQL
docker logs api_productos_mysql
```

#### **Acceder a MySQL Directamente:**
```bash
# Conectar a MySQL desde terminal
docker exec -it api_productos_mysql mysql -u api_user -p

# Contraseña: api_password
```

#### **Verificar Datos en Base de Datos:**
```sql
USE db_api_productos;
SELECT usuario, contrasenia, rol, estado FROM usuarios;
```

### ⚠️ Solución de Problemas Comunes

#### **Problema: Hash no se actualiza después de cambiar SQL**
**Síntomas:** 
- La aplicación sigue usando el hash antiguo
- `contrasenia_coincide: false` en `/test/auth-debug`

**Solución:**
```bash
# Forzar recreación completa de la base de datos
docker-compose down -v
docker-compose up -d
```

#### **Problema: Contenedor no inicia**
**Síntomas:**
- Error al levantar contenedor
- Puerto 3306 ocupado

**Solución:**
```bash
# Verificar si hay contenedores corriendo
docker ps

# Detener todos los contenedores
docker-compose down

# Verificar puertos en uso
netstat -an | findstr :3306
```

#### **Problema: Datos no persisten**
**Síntomas:**
- Datos se pierden al reiniciar
- Tablas vacías

**Solución:**
```bash
# Verificar volúmenes
docker volume ls

# Recrear con volúmenes
docker-compose down -v
docker-compose up -d
```

## Para Producción

Cuando pases a producción, asegúrate de:
1. Cambiar todas las contraseñas por hashes BCrypt
2. Usar contraseñas únicas y seguras para cada usuario
3. Implementar políticas de seguridad adecuadas
4. Usar los generadores de hashes BCrypt mencionados arriba 