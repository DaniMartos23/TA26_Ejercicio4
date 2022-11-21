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

import com.crud.http.dto.Investigadores;
import com.crud.http.service.InvestigadoresServiceImpl;

@RestController
@RequestMapping("/api")

public class InvestigadoresController {

	@Autowired
	InvestigadoresServiceImpl investigadoresServiceImpl;
	
	@GetMapping("/productos")
	public List<Investigadores> listarProductos(){
		return investigadoresServiceImpl.listarProductos();
	}
	
	//listar productos por campo nombre
	@GetMapping("/productos/nombre/{nombre}")
	public List<Investigadores> listarProductoNombre(@PathVariable(name="nombre") String nombre) {
	    return investigadoresServiceImpl.listarProductoNombre(nombre);
	}
	
	
	@PostMapping("/productos")
	public Investigadores salvarProducto( @RequestBody Investigadores investigadores) {
		return investigadoresServiceImpl.guardarProducto(investigadores);
	}
	
	
	@GetMapping("/productos/{codigo}")
	public Investigadores ProductoXID(@PathVariable(name="codigo") int codigo) {
		
		Investigadores producto_xid= new Investigadores();
		
		producto_xid= investigadoresServiceImpl.productoXID(codigo);
		
		System.out.println("Producto XID: "+producto_xid);
		
		return producto_xid;
	}
	
	@PutMapping("/productos/{codigo}")
	public Investigadores actualizarProducto(@PathVariable(name="codigo")int codigo, @RequestBody Investigadores investigadores) {
		
		Investigadores producto_seleccionado= new Investigadores();
		Investigadores producto_actualizado= new Investigadores();
		
		producto_seleccionado= investigadoresServiceImpl.productoXID(codigo);
		
		producto_seleccionado.setNombre(investigadores.getNombre());
		producto_actualizado = investigadoresServiceImpl.actualizarProducto(producto_seleccionado);
		
		System.out.println("El Producto actualizado es: "+ producto_actualizado);
		
		return producto_actualizado;
	}
	
	@DeleteMapping("/productos/{codigo}")
	public void eliminarProducto(@PathVariable(name="codigo")int codigo) {
		investigadoresServiceImpl.eliminarProducto(codigo);
	}
}
