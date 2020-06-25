package org.generation.getMoveis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name= "TB_FUNCIONARIO")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idFuncionario;

	@Column(name = "codigoCpf")
	private long codigoCpf;
	
	@NotNull
	@Size(min =5, max = 100)
	private String nomeFuncionario;

	private String funcionario;
	
	private Date dtNascimento;
	
	@NotNull
	@Size(min =5, max = 100)
	private String email;
	
	@NotNull
	@Size(min =5, max = 100)
	private String senha;

	//Getters e Setters
	
	public long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public long getCodigoCpf() {
		return codigoCpf;
	}

	public void setCodigoCpf(long codigoCpf) {
		this.codigoCpf = codigoCpf;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
