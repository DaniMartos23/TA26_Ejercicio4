package com.crud.http.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Facultad;

public interface IFacultadDAO extends JpaRepository<Facultad, Integer> {
	
}
