package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Equipos;


public interface IEquiposService {
	//Metodos del CRUD
	public List<Equipos> listarMaquinas(); //Listar All 
	
	public Equipos guardarMaquina(Equipos maquina);	//Guarda un maquina CREATE
	
	public Equipos maquinaXID(int codigo); //Leer datos de un maquina READ
			
			
	public Equipos actualizarMaquina(Equipos maquina); //Actualiza datos del maquina UPDATE
			
	public void eliminarMaquina(int codigo);// Elimina el maquina DELETE
}
