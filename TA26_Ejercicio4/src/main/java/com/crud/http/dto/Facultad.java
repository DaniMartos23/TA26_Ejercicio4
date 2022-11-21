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
@Table(name="cajeros")//en caso que la tabala sea diferente
public class Facultad {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int codigo;
	
	@Column(name = "nomapels")
	private String nomapels;
	
	
	@OneToMany()
    @JoinColumn(name = "cajero")
    List<Reserva> reserva;
	
	public Facultad() {
		
	}
	
	
	
	public Facultad(int codigo, String nomapels, List<Reserva> reserva) {
		//super();
		this.codigo = codigo;
		this.nomapels = nomapels;
		this.reserva = reserva;
	}





	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}



	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajeros")
	public List<Reserva> getVenta() {
		return reserva;
	}
	
	
	public void setVenta(List<Reserva> reserva) {
		this.reserva = reserva;
	}



	@Override
	public String toString() {
		return "Cajero [codigo=" + codigo + ", nomapels=" + nomapels +"]";
	}

	
	
}
