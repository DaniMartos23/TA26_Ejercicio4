package com.crud.http.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer> {
	
}
