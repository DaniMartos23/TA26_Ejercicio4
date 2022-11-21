package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IEquiposDAO;
import com.crud.http.dto.Equipos;


@Service
public class EquiposServiceImpl implements IEquiposService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IEquiposDAO iMaquinasDAO;
	
	@Override
	public List<Equipos> listarMaquinas() {
		// TODO Auto-generated method stub
		return iMaquinasDAO.findAll();
	}

	@Override
	public Equipos guardarMaquina(Equipos producto) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.save(producto);
	}

	@Override
	public Equipos maquinaXID(int codigo) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.findById(codigo).get();
	}


	@Override
	public Equipos actualizarMaquina(Equipos producto) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.save(producto);
	}

	@Override
	public void eliminarMaquina(int codigo) {
		
		iMaquinasDAO.deleteById(codigo);
		
	}
	
	

}
