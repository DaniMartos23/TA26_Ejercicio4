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

import com.crud.http.dto.Equipos;
import com.crud.http.service.EquiposServiceImpl;

@RestController
@RequestMapping("/api")

public class EquiposController {

	@Autowired
	EquiposServiceImpl equiposServiceImpl;
	
	@GetMapping("/maquinas")
	public List<Equipos> listarMaquinas(){
		return equiposServiceImpl.listarMaquinas();
	}
	
	
	
	
	@PostMapping("/maquinas")
	public Equipos salvarMaquina( @RequestBody Equipos maquina) {
		return equiposServiceImpl.guardarMaquina(maquina);
	}
	
	
	@GetMapping("/maquinas/{codigo}")
	public Equipos MaquinaXID(@PathVariable(name="codigo") int codigo) {
		
		Equipos maquina_xid= new Equipos();
		
		maquina_xid= equiposServiceImpl.maquinaXID(codigo);
		
		System.out.println("Maquina_Registradora XID: "+maquina_xid);
		
		return maquina_xid;
	}
	
	@PutMapping("/maquinas/{codigo}")
	public Equipos actualizarMaquina(@PathVariable(name="codigo")int codigo, @RequestBody Equipos maquina) {
		
		Equipos maquina_seleccionado= new Equipos();
		Equipos maquina_actualizado= new Equipos();
		
		maquina_seleccionado= equiposServiceImpl.maquinaXID(codigo);
		
		maquina_seleccionado.setPiso(maquina.getPiso());
		maquina_actualizado = equiposServiceImpl.actualizarMaquina(maquina_seleccionado);
		
		System.out.println("La Maquina Registradora actualizada es: "+ maquina_actualizado);
		
		return maquina_actualizado;
	}
	
	@DeleteMapping("/maquinas/{codigo}")
	public void eliminarMaquina(@PathVariable(name="codigo")int codigo) {
		equiposServiceImpl.eliminarMaquina(codigo);
	}
}
