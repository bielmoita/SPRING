package org.generation.getMoveis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name= "TB_USUARIO")
public class Usuario {
	
	@Column(name = "codigoCpf")
	@Id
	private long codigoCpf;
	

	@NotNull
	@Size(min =5, max = 100)
	private String nomeCliente;

	private Date dtNascimento;
	
	@NotNull
	@Size(min =5, max = 100)
	private String email;
	
	@NotNull
	@Size(min =5, max = 100)
	private String senha;

	public long getCodigoCpf() {
		return codigoCpf;
	}

	public void setCodigoCpf(long codigoCpf) {
		this.codigoCpf = codigoCpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
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

