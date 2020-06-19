package com.generation.clinica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicoDto {
	
	private Long crm;
	
	private String nome;
	
	private Long especialidade;

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

	public Long getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Long especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
