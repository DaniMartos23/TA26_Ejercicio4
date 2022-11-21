package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IReservaDAO;
import com.crud.http.dto.Reserva;


@Service
public class ReservaServiceImpl implements IReservaService{
	
	@Autowired
	IReservaDAO iAsignado_asDAO;
	
	@Override
	public List<Reserva> listarVenta() {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.findAll();
	}

	@Override
	public Reserva guardarVenta(Reserva reserva) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.save(reserva);
	}

	@Override
	public Reserva ventaXID(int id) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.findById(id).get();
	}

	

	@Override
	public Reserva actualizarVenta(Reserva reserva) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.save(reserva);
	}

	@Override
	public void eliminarVenta(int id) {
		
		iAsignado_asDAO.deleteById(id);
		
	}
	
	

}
