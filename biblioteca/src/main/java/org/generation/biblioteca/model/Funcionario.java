package org.generation.biblioteca.model;
import java.util.Date;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {
	
	@Id
	private long cdFuncionario;
	
	@NotNull
	private int cpfFuncionario;
	
	@NotNull
	@Size(min=3,max=120)
	private String nomeFuncionario;
	
	@NotNull
	@Size(min=18,max=20)
	private String telefoneFuncionario;
	
	@NotNull
	@Size(min=3,max=120)
	private String cargoFuncionario;

			
	//Getters e Setters
	
	public long getCdFuncionario() {
		return cdFuncionario;
	}

	public void setCdFuncionario(long cdFuncionario) {
		this.cdFuncionario = cdFuncionario;
	}

	public int getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(int cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	public void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}

	public String getCargoFuncionario() {
		return cargoFuncionario;
	}

	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}

}
