# 📚 Guía de Uso - Colección Postman

## 🚀 Importar la Colección

1. **Abrir Postman**
2. **Importar colección**: File → Import → Seleccionar `Postman_Complete_API_Productos.json`
3. **¡Listo!** Las variables ya están preconfiguradas en la colección

## 🔧 Configuración de Variables

### Variables Preconfiguradas en la Colección:

| Variable | Valor | Descripción |
|----------|-------|-------------|
| `base_url` | `http://localhost:8092` | URL base de la API |
| `jwt_token` | (se llena automáticamente) | Token JWT obtenido del login |
| `admin_user` | `admin` | Usuario administrador |
| `admin_password` | `password` | Contraseña del administrador |
| `api_version` | `v1` | Versión de la API |

### ✅ No se requiere configuración adicional
Las variables ya están incluidas en la colección y se configuran automáticamente.

## 🔐 Flujo de Autenticación

### 1. Obtener Token JWT
```bash
POST {{base_url}}/login
Content-Type: application/json

{
    "usuario": "admin",
    "contrasenia": "password"
}
```

### 2. ✅ Token Automático
El token JWT se extrae y guarda automáticamente en la colección unificada.

## 📋 Endpoints Disponibles

### 🔐 Autenticación
- **POST** `/login` - Obtener token JWT

### 🧪 Testing
- **GET** `/test/health` - Verificar estado de la API
- **GET** `/test/db` - Verificar conexión a BD

### 📦 Productos - Lectura
- **GET** `/v1/productos` - Listar productos (paginado)
- **GET** `/v1/productos/id/{id}` - Obtener por ID
- **GET** `/v1/productos/codigo/{codigo}` - Buscar por código
- **GET** `/v1/productos/nombre/{nombre}` - Buscar por nombre
- **GET** `/v1/productos/precio/{precio}` - Buscar por precio

### 📝 Productos - Administración (Requiere ADMIN)
- **POST** `/v1/producto` - Crear producto
- **PUT** `/v1/producto` - Actualizar producto
- **DELETE** `/v1/producto/{id}` - Eliminar producto

## 🎯 Ejemplos de Uso

### 1. Verificar API Funcionando
```bash
GET http://localhost:8092/test/health
```

### 2. Login y Obtener Token
```bash
POST http://localhost:8092/login
Content-Type: application/json

{
    "usuario": "admin",
    "contrasenia": "password"
}
```

### 3. Listar Productos
```bash
GET http://localhost:8092/v1/productos?page=0&size=5
Authorization: Token: [TOKEN_OBTENIDO]
```

### 4. Crear Nuevo Producto
```bash
POST http://localhost:8092/v1/producto
Content-Type: application/json
Authorization: Token: [TOKEN_OBTENIDO]

{
    "codigo": "PROD006",
    "nombre": "Nuevo Producto",
    "precio": 149.99
}
```

## 🔍 Parámetros de Paginación

### Listar Productos
- `page`: Número de página (base 0)
- `size`: Tamaño de la página (máximo 10)
- `sort`: Ordenamiento (ej: `id,asc`, `nombre,desc`)

### Ejemplos:
```
GET /v1/productos?page=0&size=5&sort=nombre,asc
GET /v1/productos?page=1&size=3&sort=precio,desc
```

## 🛡️ Roles y Permisos

### Roles Disponibles:
- **LECTURA** (1): Solo puede leer productos
- **USUARIO** (2): Puede leer y algunas operaciones básicas
- **ADMINISTRADOR** (3): Acceso completo (CRUD)

### Endpoints por Rol:
- **Públicos**: `/login`, `/test/**`
- **LECTURA**: GET `/v1/productos/**`
- **ADMINISTRADOR**: POST, PUT, DELETE `/v1/producto/**`

## 🧪 Datos de Prueba

### Usuarios Disponibles:

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

### Productos de Ejemplo (35 productos):

#### Laptops y Computadoras:
- PROD001: Laptop HP Pavilion - $899.99
- PROD002: Laptop Dell Inspiron - $749.99
- PROD003: Laptop Lenovo ThinkPad - $1299.99
- PROD004: MacBook Air M1 - $1499.99
- PROD005: Laptop ASUS ROG Gaming - $1899.99

#### Periféricos:
- PROD006: Mouse Inalámbrico Logitech - $29.99
- PROD007: Teclado Mecánico RGB - $89.99
- PROD008: Mouse Gaming Razer - $59.99
- PROD009: Teclado Bluetooth Apple - $99.99
- PROD010: Mouse Pad Gaming XL - $19.99

#### Monitores:
- PROD011: Monitor 24" Samsung - $199.99
- PROD012: Monitor 27" LG UltraWide - $399.99
- PROD013: Monitor 32" 4K Dell - $599.99
- PROD014: Monitor Gaming 144Hz - $349.99
- PROD015: Monitor Curvo Samsung - $299.99

#### Audio:
- PROD016: Auriculares Bluetooth Sony - $79.99
- PROD017: Auriculares Gaming HyperX - $89.99
- PROD018: Altavoces Bluetooth JBL - $129.99
- PROD019: Micrófono USB Blue Yeti - $149.99
- PROD020: Auriculares Noise Cancelling - $199.99

#### Almacenamiento:
- PROD021: SSD Samsung 500GB - $89.99
- PROD022: Disco Duro 2TB Seagate - $69.99
- PROD023: SSD NVMe 1TB WD - $129.99
- PROD024: Memoria USB 64GB SanDisk - $24.99
- PROD025: Tarjeta SD 128GB Kingston - $34.99

#### Red y Conectividad:
- PROD026: Router WiFi 6 TP-Link - $89.99
- PROD027: Cable HDMI 2.0 3m - $19.99
- PROD028: Adaptador USB-C a HDMI - $29.99
- PROD029: Switch Ethernet 8 Puertos - $39.99
- PROD030: Cable de Red Cat6 100m - $49.99

#### Accesorios:
- PROD031: Soporte para Laptop - $39.99
- PROD032: Cámara Web Logitech - $79.99
- PROD033: Lámpara LED de Escritorio - $49.99
- PROD034: Organizador de Cables - $14.99
- PROD035: Alfombrilla Antiestática - $9.99

## 🔧 Troubleshooting

### Error 401 - Unauthorized
- Verificar que el token JWT sea válido
- Hacer login nuevamente para obtener nuevo token

### Error 403 - Forbidden
- Verificar que el usuario tenga el rol necesario
- Usar usuario `admin` para operaciones de administración

### Error 500 - Internal Server Error
- Verificar que la base de datos esté funcionando
- Revisar logs de la aplicación Spring Boot

### Error de Conexión
- Verificar que la aplicación esté corriendo en puerto 8092
- Verificar que Docker MySQL esté funcionando

## 📝 Scripts Útiles

### Auto-guardar Token
```javascript
// En Tests del request Login
if (pm.response.code === 200) {
    var token = pm.response.headers.get("Authorization");
    if (token) {
        pm.environment.set("jwt_token", token.replace("Token: ", ""));
    }
}
```

### Validar Respuesta
```javascript
// En Tests de cualquier request
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("Response time is less than 2000ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(2000);
});
```

## 🎨 Personalización

### Cambiar URL Base
Para usar en diferentes entornos, modificar la variable `base_url`:
- **Local**: `http://localhost:8092`
- **Desarrollo**: `http://dev-api:8092`
- **Producción**: `http://api-produccion.com`

### Agregar Headers Personalizados
En la colección, agregar headers adicionales según necesidades:
- `Accept-Language`: `es-ES`
- `User-Agent`: `PostmanRuntime/7.29.0`

## 📦 Archivo Unificado

### Ventajas del archivo `Postman_Complete_API_Productos.json`:

- **✅ Todo en uno**: Colección + variables incluidas
- **✅ Configuración automática**: No requiere setup manual
- **✅ Token automático**: Se guarda automáticamente al hacer login
- **✅ Tests incluidos**: Validaciones automáticas en cada request
- **✅ Fácil importación**: Un solo archivo para importar

### Estructura del archivo:
```
Postman_Complete_API_Productos.json
├── 🔐 Autenticación
│   └── Login - Obtener Token JWT
├── 🧪 Testing
│   ├── Health Check
│   └── Database Test
├── 📦 Productos - CRUD
│   ├── Listar Productos (Paginado)
│   ├── Obtener Producto por ID
│   ├── Buscar por Código
│   ├── Buscar por Nombre
│   └── Buscar por Precio
├── 📝 Productos - Administración
│   ├── Crear Nuevo Producto
│   ├── Actualizar Producto
│   └── Eliminar Producto
└── Variables preconfiguradas
``` 