package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IInvestigadoresDAO;
import com.crud.http.dto.Investigadores;


@Service
public class InvestigadoresServiceImpl implements IInvestigadoresService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IInvestigadoresDAO iProductosDAO;
	
	@Override
	public List<Investigadores> listarProductos() {
		// TODO Auto-generated method stub
		return iProductosDAO.findAll();
	}

	@Override
	public Investigadores guardarProducto(Investigadores investigadores) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(investigadores);
	}

	@Override
	public Investigadores productoXID(int codigo) {
		// TODO Auto-generated method stub
		return iProductosDAO.findById(codigo).get();
	}

	@Override
	public List<Investigadores> listarProductoNombre(String nombre) {
		// TODO Auto-generated method stub
		return iProductosDAO.findByNombre(nombre);
	}

	@Override
	public Investigadores actualizarProducto(Investigadores investigadores) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(investigadores);
	}

	@Override
	public void eliminarProducto(int codigo) {
		
		iProductosDAO.deleteById(codigo);
		
	}
	
	

}
