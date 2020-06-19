package com.generation.clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbEspecialidade")
public class EspecialidadeModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //AutoIncremento
	@Column(name="codEspecialidade")
	private long codEspecialidade;
	
	@Column(name="nomeEspecialidade", nullable=false, length=50)
	private String nomeEspecialidade;
	
	//GETTERS e SETTERS

	public long getCodEspecialidade() {
		return codEspecialidade;
	}

	public void setCodEspecialidade(long codEspecialidade) {
		this.codEspecialidade = codEspecialidade;
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}
	
	

}
