package com.crud.http.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.http.dto.Facultad;
import com.crud.http.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")

public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Facultad> listarCajeros(){
		return facultadServiceImpl.listarCajeros();
	}
	
	
	
	
	@PostMapping("/cajeros")
	public Facultad salvarCajero( @RequestBody Facultad facultad) {
		return facultadServiceImpl.guardarCajero(facultad);
	}
	
	
	@GetMapping("/cajeros/{codigo}")
	public Facultad CajeroXID(@PathVariable(name="codigo") int codigo) {
		
		Facultad cajero_xid= new Facultad();
		
		cajero_xid= facultadServiceImpl.cajeroXID(codigo);
		
		System.out.println("Cajero XID: "+cajero_xid);
		
		return cajero_xid;
	}
	
	@PutMapping("/cajeros/{codigo}")
	public Facultad actualizarCajero(@PathVariable(name="codigo")int codigo, @RequestBody Facultad facultad) {
		
		Facultad cajero_seleccionado= new Facultad();
		Facultad cajero_actualizado= new Facultad();
		
		cajero_seleccionado= facultadServiceImpl.cajeroXID(codigo);
		
		cajero_seleccionado.setNomapels(facultad.getNomapels());
		cajero_actualizado = facultadServiceImpl.actualizarCajero(cajero_seleccionado);
		
		System.out.println("El Cajero actualizado es: "+ cajero_actualizado);
		
		return cajero_actualizado;
	}
	
	@DeleteMapping("/cajeros/{codigo}")
	public void eliminarCajero(@PathVariable(name="codigo")int codigo) {
		facultadServiceImpl.eliminarCajero(codigo);
	}
}
