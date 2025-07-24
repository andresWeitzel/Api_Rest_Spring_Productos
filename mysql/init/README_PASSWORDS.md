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

## Para Producción

Cuando pases a producción, asegúrate de:
1. Cambiar todas las contraseñas por hashes BCrypt
2. Usar contraseñas únicas y seguras para cada usuario
3. Implementar políticas de seguridad adecuadas 