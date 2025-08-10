-- =====================================================
-- DML - Data Manipulation Language
-- Datos de ejemplo para API REST Productos
-- =====================================================

USE db_api_productos;

INSERT INTO usuarios (usuario, contrasenia, rol, estado) VALUES
('admin', '$2a$12$EGKzUPWUeJpc2CyicZo/heK630sRFMFX.UC1XQe3xQBlAwcDjIffC', 3, true)
ON DUPLICATE KEY UPDATE usuario = usuario;

INSERT INTO productos (codigo, nombre, precio) VALUES
('PROD001', 'Laptop HP Pavilion', 899.99),
('PROD002', 'Laptop Dell Inspiron', 749.99),
('PROD003', 'Laptop Lenovo ThinkPad', 1299.99),
('PROD004', 'MacBook Air M1', 1499.99),
('PROD005', 'Laptop ASUS ROG Gaming', 1899.99),
('PROD006', 'Mouse Inalámbrico Logitech', 29.99),
('PROD007', 'Teclado Mecánico RGB', 89.99),
('PROD008', 'Mouse Gaming Razer', 59.99),
('PROD009', 'Teclado Bluetooth Apple', 99.99),
('PROD010', 'Mouse Pad Gaming XL', 19.99),
('PROD011', 'Monitor 24" Samsung', 199.99),
('PROD012', 'Monitor 27" LG UltraWide', 399.99),
('PROD013', 'Monitor 32" 4K Dell', 599.99),
('PROD014', 'Monitor Gaming 144Hz', 349.99),
('PROD015', 'Monitor Curvo Samsung', 299.99),
('PROD016', 'Auriculares Bluetooth Sony', 79.99),
('PROD017', 'Auriculares Gaming HyperX', 89.99),
('PROD018', 'Altavoces Bluetooth JBL', 129.99),
('PROD019', 'Micrófono USB Blue Yeti', 149.99),
('PROD020', 'Auriculares Noise Cancelling', 199.99),
('PROD021', 'SSD Samsung 500GB', 89.99),
('PROD022', 'Disco Duro 2TB Seagate', 69.99),
('PROD023', 'SSD NVMe 1TB WD', 129.99),
('PROD024', 'Memoria USB 64GB SanDisk', 24.99),
('PROD025', 'Tarjeta SD 128GB Kingston', 34.99),
('PROD026', 'Router WiFi 6 TP-Link', 89.99),
('PROD027', 'Cable HDMI 2.0 3m', 19.99),
('PROD028', 'Adaptador USB-C a HDMI', 29.99),
('PROD029', 'Switch Ethernet 8 Puertos', 39.99),
('PROD030', 'Cable de Red Cat6 100m', 49.99),
('PROD031', 'Soporte para Laptop', 39.99),
('PROD032', 'Cámara Web Logitech', 79.99),
('PROD033', 'Lámpara LED de Escritorio', 49.99),
('PROD034', 'Organizador de Cables', 14.99),
('PROD035', 'Alfombrilla Antiestática', 9.99)
ON DUPLICATE KEY UPDATE codigo = codigo; 