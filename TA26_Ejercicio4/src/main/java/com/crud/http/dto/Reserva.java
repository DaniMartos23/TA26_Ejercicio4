package com.crud.http.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="venta")//en caso que la tabala sea diferente
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "producto")
	Investigadores investigadores;
	
	@ManyToOne
    @JoinColumn(name = "cajero")
	Facultad facultad;
	
	@ManyToOne
    @JoinColumn(name = "maquina")
	Equipos maquina;


	public Reserva() {
		
	}


	public Reserva(int id, Investigadores investigadores, Facultad facultad,Equipos maquinas) {
		super();
		this.id = id;
		this.investigadores = investigadores;
		this.facultad = facultad;
		this.maquina=maquinas;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}	
	
	public Investigadores getProductos() {
		return investigadores;
	}


	public void setProductos(Investigadores investigadores) {
		this.investigadores = investigadores;
	}


	public Facultad getCajero() {
		return facultad;
	}


	public void setCajero(Facultad facultad) {
		this.facultad = facultad;
	}


	public Equipos getMaquinas() {
		return maquina;
	}


	public void setMaquinas(Equipos maquinas) {
		this.maquina = maquinas;
	}


	@Override
	public String toString() {
		return "Venta [id=" + id + ", producto=" + investigadores + ", cajero=" + facultad + ", maquina=" + maquina + "]";
	}


	


	
	
	
	
	
	
}
