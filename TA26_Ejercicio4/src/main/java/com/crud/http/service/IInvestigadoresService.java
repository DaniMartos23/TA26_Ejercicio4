package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Investigadores;

public interface IInvestigadoresService {
	//Metodos del CRUD
	public List<Investigadores> listarProductos(); //Listar All 
	
	public Investigadores guardarProducto(Investigadores investigadores);	//Guarda un producto CREATE
	
	public Investigadores productoXID(int codigo); //Leer datos de un producto READ
			
	public List<Investigadores> listarProductoNombre(String nombre);//Listar Productos por campo nombre
			
	public Investigadores actualizarProducto(Investigadores investigadores); //Actualiza datos del producto UPDATE
			
	public void eliminarProducto(int codigo);// Elimina el producto DELETE
}
