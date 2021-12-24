package com.api.productos.mypackages.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.productos.mypackages.converters.ProductoConverter;
import com.api.productos.mypackages.entities.Producto;
import com.api.productos.mypackages.models.ProductoModel;
import com.api.productos.mypackages.repositories.interfaces.I_ProductoRepository;


@Service("ProductoService")
public class ProductoService {
	
	// ========= INYECCIÓN DE DEPENDENCIAS ==========
	@Autowired
	@Qualifier("I_ProductoRepository")
	private I_ProductoRepository iProductoRepository;

	
	@Autowired
	@Qualifier("ProductoConverter")
	private ProductoConverter productoConvertidor;
	
	
	
	//==================== LOGS ============================
	
	//LOGS DE ERROR
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ProductoService.class);
	
	
	
	
	//===================== MÉTODOS CRUD ===========================
	
	//INSERT
	public boolean agregarProducto(Producto producto) {
		
		try {
			if (producto == null) {
				logger.error("ERROR AGREGAR_PRODUCTO: EL PRODUCTO ES NULO!");
				return false;				
			}
			
			else {
				iProductoRepository.save(producto);
				return true;
				
			}
		
			
		}catch(Exception e) {
			logger.error("ERROR AGREGAR_PRODUCTO: EL PRODUCTO NO SE HA GUARDADO!");
			return false;
			
			
		}
	}
	
	
	
	//UPDATE
	public boolean editarProducto(Producto producto) {
			
			try {
				
				if ((producto == null) || (producto.getId() == 0)) {
					logger.error("ERROR EDITAR_PRODUCTO:  EL PRODUCTO ES NULO O EL ID ES 0!");		
					return false;
					
				}
				
				else {	
					iProductoRepository.save(producto);
					return true;
					
				}
			
				
			}catch(Exception e) {
				logger.error("ERROR EDITAR_PRODUCTO: EL PRODUCTO NO SE HA EDITADO!");		
				return false;
				
			}
		}
	
	//DELETE
	public boolean eliminarProducto(int id) {
					
			try {
						
				if ((id == 0)) {
					logger.error("ERROR ELIMINAR_PRODUCTO: EL ID DEL PRODUCTO ES 0!");
					return false;
				}
				
				else {
							
					Producto idProducto = iProductoRepository.findById(id);
							
					iProductoRepository.delete(idProducto);

					return true;
					}
					
						
				}catch(Exception e) {
					logger.error("ERROR ELIMINAR_PRODUCTO: EL PRODUCTO NO SE HA ELIMINADO!");
					return false;
					
				} 
	}
	
	
	//LISTA DE PRODUCTOS
	public ArrayList<ProductoModel> listadoProductos(){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findAll()); 
		
	}
	
	
	// LISTA DE PRODUCTOS POR PAGINACIÓN
	public List<ProductoModel> listadoProductosPaginacion(Pageable pageable){
		return  productoConvertidor.convertirListaProducto(iProductoRepository.findAll(pageable).getContent());
	}
	
	
	
	
	
	//================ METODOS DE USO =============================
	
	
	//PRODUCTO POR ID | VALOR UNICO
	public ProductoModel findById(int id) {
		
		return new ProductoModel(iProductoRepository.findById(id));
		
	}
	
	//PRODUCTO POR CODIGO | VALOR UNICO
	public ProductoModel findByCodigo(String codigo) {
		
		return new ProductoModel(iProductoRepository.findByCodigo(codigo));
	}
		
	
	//LISTA DE PRODUCTOS POR NOMBRE
	public ArrayList<ProductoModel> findByNombre(String nombre){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByNombre(nombre)); 
		
	}
	
	//LISTA DE PRODUCTOS POR PRECIO
	public ArrayList<ProductoModel> findByPrecio(double precio){
		
		return productoConvertidor.convertirListaProducto(iProductoRepository.findByPrecio(precio)); 
		
	}
	

	
	

	

}
