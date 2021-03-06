package com.generation.clinica.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbMedico")
public class MedicoModel {
	@Id
	private Long crm;
	
	@Column(name="nome_medico", nullable=false, length=80)
	@Size(min=2,max=80)
	private String nome;
	
	//Chave estrangeira - relacionada com a tabela especialidade
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "codigoespecialidade")
	private EspecialidadeModel especialidade;

	
	//GETTERS e Setters
	
	
	public Long getCrm() {
		return crm;
	}

	public void setCrm(Long crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EspecialidadeModel getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(EspecialidadeModel especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
