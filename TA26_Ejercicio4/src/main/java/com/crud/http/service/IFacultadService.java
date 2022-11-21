package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Facultad;

public interface IFacultadService {
	//Metodos del CRUD
	public List<Facultad> listarCajeros(); //Listar All 
	
	public Facultad guardarCajero(Facultad facultad);	//Guarda un cajero CREATE
	
	public Facultad cajeroXID(int codigo); //Leer datos de un cajero READ
			
	
			
	public Facultad actualizarCajero(Facultad facultad); //Actualiza datos del cajero UPDATE
			
	public void eliminarCajero(int codigo);// Elimina el cajero DELETE
}
