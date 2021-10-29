package com.umg.ecommerce.service;

import java.util.Optional;

import com.umg.ecommerce.model.Producto;

public interface ProductoService {
	
	//metodos crud
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	

}
