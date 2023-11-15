package com.agencia.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pacotes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String destino;
	private String data_Chegada;
	private String data_Saida;
	private double preco;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getData_Chegada() {
		return data_Chegada;
	}
	public void setData_Chegada(String data_Chegada) {
		this.data_Chegada = data_Chegada;
	}
	public String getData_Saida() {
		return data_Saida;
	}
	public void setData_Saida(String data_Saida) {
		this.data_Saida = data_Saida;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacotes other = (Pacotes) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
