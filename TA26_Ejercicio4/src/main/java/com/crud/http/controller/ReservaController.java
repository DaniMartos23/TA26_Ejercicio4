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

import com.crud.http.dto.Reserva;
import com.crud.http.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")

public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@GetMapping("/venta")
	public List<Reserva> listarVentas(){
		return reservaServiceImpl.listarVenta();
	}
	
	
	
	
	@PostMapping("/venta")
	public Reserva salvarVenta( @RequestBody Reserva reserva) {
		return reservaServiceImpl.guardarVenta(reserva);
	}
	
	
	@GetMapping("/venta/{codigo}")
	public Reserva VentaXID(@PathVariable(name="codigo") int id) {
		
		Reserva venta_xid= new Reserva();
		
		venta_xid= reservaServiceImpl.ventaXID(id);
		
		System.out.println("Venta XID: "+venta_xid);
		
		return venta_xid;
	}
	
	@PutMapping("/venta/{codigo}")
	public Reserva actualizarVenta(@PathVariable(name="codigo")int id, @RequestBody Reserva reserva) {
		
		Reserva venta_seleccionado= new Reserva();
		Reserva venta_actualizado= new Reserva();
		
		venta_seleccionado= reservaServiceImpl.ventaXID(id);
		venta_seleccionado.setProductos(reserva.getProductos());
		venta_seleccionado.setCajero(reserva.getCajero());
		venta_seleccionado.setMaquinas(reserva.getMaquinas());
		venta_actualizado = reservaServiceImpl.actualizarVenta(venta_seleccionado);
		
		System.out.println("El Venta actualizado es: "+ venta_actualizado);
		
		return venta_actualizado;
	}
	
	@DeleteMapping("/venta/{codigo}")
	public void eliminarVenta(@PathVariable(name="codigo")int id) {
		reservaServiceImpl.eliminarVenta(id);
	}
}
