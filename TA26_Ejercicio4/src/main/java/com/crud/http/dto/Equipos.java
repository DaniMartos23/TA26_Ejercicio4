package com.crud.http.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="maquinasregistradoras")//en caso que la tabala sea diferente
public class Equipos {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int codigo;
	
	@Column(name = "piso")
	private int piso;
	
	
	@OneToMany()
    @JoinColumn(name = "maquina")
    List<Reserva> reserva;
	
	public Equipos() {
		
	}
	
	
	
	public Equipos(int codigo,int piso, List<Reserva> reserva) {
		//super();
		this.codigo = codigo;
		this.piso=piso;
		this.reserva = reserva;
	}





	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public int getPiso() {
		return piso;
	}



	public void setPiso(int piso) {
		this.piso = piso;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "maquinasregistradoras")
	public List<Reserva> getVenta() {
		return reserva;
	}
	
	
	public void setVenta(List<Reserva> reserva) {
		this.reserva = reserva;
	}



	@Override
	public String toString() {
		return "Maquinas [codigo=" + codigo +", piso="+piso+"]";
	}

	
	
}
