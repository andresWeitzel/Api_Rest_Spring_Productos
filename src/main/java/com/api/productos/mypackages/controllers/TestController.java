package com.api.productos.mypackages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private javax.sql.DataSource dataSource;
    
    @Autowired
    private com.api.productos.mypackages.repositories.interfaces.I_UsuarioRepository usuarioRepository;
    
    @Autowired
    private org.springframework.security.authentication.AuthenticationManager authenticationManager;
    
    @Autowired
    private org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;

    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "API REST Spring Productos is running successfully");
        response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        response.put("version", "1.0.0");
        response.put("port", 8092);
        response.put("environment", "development");
        
        Map<String, String> services = new HashMap<>();
        services.put("database", "connected");
        services.put("security", "enabled");
        services.put("jpa", "active");
        
        response.put("services", services);
        
        return response;
    }
    
    @GetMapping("/db")
    public Map<String, Object> testDatabase() {
        Map<String, Object> response = new HashMap<>();
        
        try {
            // Usar el DataSource inyectado
            
            // Probar la conexión
            try (java.sql.Connection connection = dataSource.getConnection()) {
        response.put("status", "connected");
        response.put("message", "Database connection test successful");
        response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        response.put("database", "MySQL");
                response.put("host", connection.getMetaData().getURL());
                response.put("database_name", connection.getCatalog());
        response.put("connection_pool", "HikariCP");
        
        Map<String, String> connection_info = new HashMap<>();
                connection_info.put("driver", connection.getMetaData().getDriverName());
        connection_info.put("dialect", "MySQL8Dialect");
        connection_info.put("timezone", "UTC");
        connection_info.put("ssl", "disabled");
        
        response.put("connection_info", connection_info);
        
                // Obtener estadísticas del pool de conexiones si es HikariCP
                if (dataSource instanceof com.zaxxer.hikari.HikariDataSource) {
                    com.zaxxer.hikari.HikariDataSource hikariDS = (com.zaxxer.hikari.HikariDataSource) dataSource;
        Map<String, Object> pool_stats = new HashMap<>();
                    pool_stats.put("max_pool_size", hikariDS.getMaximumPoolSize());
                    pool_stats.put("min_idle", hikariDS.getMinimumIdle());
                    pool_stats.put("active_connections", hikariDS.getHikariPoolMXBean().getActiveConnections());
                    pool_stats.put("idle_connections", hikariDS.getHikariPoolMXBean().getIdleConnections());
                    pool_stats.put("total_connections", hikariDS.getHikariPoolMXBean().getTotalConnections());
                    
                    response.put("pool_stats", pool_stats);
                }
                
                // Probar una consulta simple
                try (java.sql.Statement stmt = connection.createStatement()) {
                    java.sql.ResultSet rs = stmt.executeQuery("SELECT COUNT(*) as total FROM usuarios");
                    if (rs.next()) {
                        response.put("usuarios_count", rs.getInt("total"));
                    }
                }
                
            }
            
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Database connection failed: " + e.getMessage());
            response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            response.put("exception", e.getClass().getSimpleName());
        }
        
        return response;
    }
    
    
    @PostMapping("/login")
    public Map<String, Object> testLogin(@RequestBody Map<String, String> credentials) {
        Map<String, Object> response = new HashMap<>();
        
        try {
            String usuario = credentials.get("usuario");
            String contrasenia = credentials.get("contrasenia");
            
            // Validar que se recibieron las credenciales
            if (usuario == null || contrasenia == null) {
                response.put("status", "error");
                response.put("message", "Usuario y contraseña son requeridos");
                return response;
            }
            
            // Buscar el usuario en la base de datos
            com.api.productos.mypackages.entities.Usuario user = usuarioRepository.findByUsuario(usuario);
            
            if (user == null) {
                response.put("status", "error");
                response.put("message", "Usuario no encontrado");
                response.put("usuario_buscado", usuario);
                return response;
            }
            
            // Verificar si el usuario está activo
            if (!user.getEstado()) {
                response.put("status", "error");
                response.put("message", "Usuario inactivo");
                response.put("usuario", user.getUsuario());
                response.put("estado", user.getEstado());
                return response;
            }
            
            // Verificar la contraseña usando PasswordEncoder
            if (!passwordEncoder.matches(contrasenia, user.getContrasenia())) {
                response.put("status", "error");
                response.put("message", "Contraseña incorrecta");
                response.put("usuario", user.getUsuario());
                return response;
            }
            
            // Login exitoso
            response.put("status", "success");
            response.put("message", "Login exitoso");
            response.put("usuario", user.getUsuario());
            response.put("rol", user.getRol());
            response.put("estado", user.getEstado());
            response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error en login: " + e.getMessage());
            response.put("exception", e.getClass().getSimpleName());
        }
        
        return response;
    }
    
    @GetMapping("/users")
    public Map<String, Object> testUsers() {
        Map<String, Object> response = new HashMap<>();
        
        try {
            java.util.List<com.api.productos.mypackages.entities.Usuario> users = usuarioRepository.findAll();
            
            response.put("status", "success");
            response.put("message", "Usuarios encontrados: " + users.size());
            response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            
            java.util.List<Map<String, Object>> usersList = new java.util.ArrayList<>();
            for (com.api.productos.mypackages.entities.Usuario user : users) {
                Map<String, Object> userInfo = new HashMap<>();
                userInfo.put("id", user.getId());
                userInfo.put("usuario", user.getUsuario());
                userInfo.put("rol", user.getRol());
                userInfo.put("estado", user.getEstado());
                usersList.add(userInfo);
            }
            response.put("usuarios", usersList);
            
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error obteniendo usuarios: " + e.getMessage());
            response.put("exception", e.getClass().getSimpleName());
        }
        
        return response;
    }
    
    @PostMapping("/auth-debug")
    public Map<String, Object> authDebug(@RequestBody Map<String, String> credentials) {
        Map<String, Object> response = new HashMap<>();
        
        try {
            String usuario = credentials.get("usuario");
            String contrasenia = credentials.get("contrasenia");
            
            response.put("status", "debug");
            response.put("message", "Debug de autenticación");
            response.put("received_usuario", usuario);
            response.put("received_contrasenia", contrasenia != null ? "***" : null);
            response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            
            // Buscar usuario directamente en la base de datos
            com.api.productos.mypackages.entities.Usuario user = usuarioRepository.findByUsuario(usuario);
            
            if (user != null) {
                response.put("usuario_encontrado", true);
                response.put("usuario_id", user.getId());
                response.put("usuario_nombre", user.getUsuario());
                response.put("usuario_rol", user.getRol());
                response.put("usuario_estado", user.getEstado());
                response.put("contrasenia_en_bd", user.getContrasenia());
                response.put("contrasenia_coincide", passwordEncoder.matches(contrasenia, user.getContrasenia()));
                
                // Verificar con Spring Security
                try {
                    org.springframework.security.authentication.UsernamePasswordAuthenticationToken authToken = 
                        new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(usuario, contrasenia);
                    
                    org.springframework.security.core.Authentication auth = authenticationManager.authenticate(authToken);
                    response.put("spring_auth_success", true);
                    response.put("spring_auth_authorities", auth.getAuthorities().toString());
                    
                } catch (Exception e) {
                    response.put("spring_auth_success", false);
                    response.put("spring_auth_error", e.getMessage());
                    response.put("spring_auth_exception", e.getClass().getSimpleName());
                }
                
            } else {
                response.put("usuario_encontrado", false);
            }
            
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error en debug: " + e.getMessage());
            response.put("exception", e.getClass().getSimpleName());
        }
        
        return response;
    }
    
    @GetMapping("/password-test")
    public Map<String, Object> passwordTest() {
        Map<String, Object> response = new HashMap<>();
        
        try {
            String[] passwords = {"Admin2024!", "password", "admin", "Admin2024"};
            
            response.put("status", "password_test");
            response.put("message", "Prueba de contraseñas");
            response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            
            Map<String, String> passwordTests = new HashMap<>();
            for (String pwd : passwords) {
                String encoded = passwordEncoder.encode(pwd);
                boolean matches = passwordEncoder.matches(pwd, "$2a$10$92IXUNpkjO0rOQ5byMi.Ye4oKoEa3Ro9llC/.og/at2.uheWG/igi");
                passwordTests.put(pwd, "encoded: " + encoded + ", matches_hash: " + matches);
            }
            response.put("password_tests", passwordTests);
            
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error en password test: " + e.getMessage());
        }
        
        return response;
    }
    
    @GetMapping("/generate-hashes")
    public Map<String, Object> generateHashes() {
        Map<String, Object> response = new HashMap<>();
        
        try {
            Map<String, String> userPasswords = new HashMap<>();
            userPasswords.put("admin", "Admin2024!");
            userPasswords.put("supervisor", "Super2024!");
            userPasswords.put("manager", "Manager24!");
            userPasswords.put("usuario1", "User1Pass!");
            userPasswords.put("usuario2", "User2Pass!");
            userPasswords.put("usuario3", "User3Pass!");
            userPasswords.put("vendedor1", "Vende2024!");
            userPasswords.put("vendedor2", "Vende2025!");
            userPasswords.put("lector1", "Lector2024!");
            userPasswords.put("lector2", "Lector2025!");
            userPasswords.put("invitado", "Invit2024!");
            userPasswords.put("consultor", "Consul2024!");
            userPasswords.put("analista", "Anali2024!");
            userPasswords.put("usuario_inactivo", "Inact2024!");
            
            Map<String, String> hashes = new HashMap<>();
            for (Map.Entry<String, String> entry : userPasswords.entrySet()) {
                String username = entry.getKey();
                String password = entry.getValue();
                String hash = passwordEncoder.encode(password);
                hashes.put(username, hash);
            }
            
            response.put("status", "success");
            response.put("message", "Hashes BCrypt generados");
            response.put("hashes", hashes);
            response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error generando hashes: " + e.getMessage());
        }
        
        return response;
    }
} 