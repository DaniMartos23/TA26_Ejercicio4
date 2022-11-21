package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Reserva;

public interface IReservaService {
	//Metodos del CRUD
	public List<Reserva> listarVenta(); //Listar All 
	
	public Reserva guardarVenta(Reserva reserva);	//Guarda un asignado_a CREATE
	
	public Reserva ventaXID(int id); //Leer datos de un asignado_a READ
			
	
			
	public Reserva actualizarVenta(Reserva reserva); //Actualiza datos del asignado_a UPDATE
			
	public void eliminarVenta(int id);// Elimina el asignado_a DELETE
}
