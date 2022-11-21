package com.crud.http.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Equipos;

public interface IEquiposDAO extends JpaRepository<Equipos, Integer> {
	
}
