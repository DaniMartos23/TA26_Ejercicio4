package com.crud.http.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Investigadores;

public interface IInvestigadoresDAO extends JpaRepository<Investigadores, Integer> {
	//Listar articulos por campo nombre
			public List<Investigadores> findByNombre(String nombre);
}
