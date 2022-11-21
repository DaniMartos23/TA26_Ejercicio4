package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IFacultadDAO;
import com.crud.http.dto.Facultad;


@Service
public class FacultadServiceImpl implements IFacultadService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IFacultadDAO iCajerosDAO;
	
	@Override
	public List<Facultad> listarCajeros() {
		// TODO Auto-generated method stub
		return iCajerosDAO.findAll();
	}

	@Override
	public Facultad guardarCajero(Facultad facultad) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(facultad);
	}

	@Override
	public Facultad cajeroXID(int codigo) {
		// TODO Auto-generated method stub
		return iCajerosDAO.findById(codigo).get();
	}



	@Override
	public Facultad actualizarCajero(Facultad facultad) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(facultad);
	}

	@Override
	public void eliminarCajero(int codigo) {
		
		iCajerosDAO.deleteById(codigo);
		
	}
	
	

}
