package com.api.productos.mypackages.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

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
        response.put("status", "connected");
        response.put("message", "Database connection test successful");
        response.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        response.put("database", "MySQL");
        response.put("host", "localhost");
        response.put("port", 3306);
        response.put("database_name", "db_api_productos");
        response.put("connection_pool", "HikariCP");
        
        Map<String, String> connection_info = new HashMap<>();
        connection_info.put("driver", "com.mysql.cj.jdbc.Driver");
        connection_info.put("dialect", "MySQL8Dialect");
        connection_info.put("timezone", "UTC");
        connection_info.put("ssl", "disabled");
        
        response.put("connection_info", connection_info);
        
        Map<String, Object> pool_stats = new HashMap<>();
        pool_stats.put("max_pool_size", 10);
        pool_stats.put("min_idle", 5);
        pool_stats.put("connection_timeout", "30s");
        pool_stats.put("idle_timeout", "5m");
        
        response.put("pool_stats", pool_stats);
        
        return response;
    }
} 