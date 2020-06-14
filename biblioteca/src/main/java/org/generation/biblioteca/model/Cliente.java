package org.generation.biblioteca.model;

import java.util.Date;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	@Id
	private long cdCpf;
	
	@NotNull
	@Size(min=3,max=120)
	private String nomeCliente;
	
	@NotNull
	@Size(min=12,max=15)
	private String dtNascimento;
	
	@NotNull
	@Size(min=3,max=120)
	private String email;
	
	@NotNull
	@Size(min=19,max=21)
	private String telefoneCliente;
	
	@NotNull
	@Size(min=3,max=120)
	private String enderecoCliente;
	
	@NotNull
	@Size(min=3,max=120)
	private String cidadeCliente;
	
	@NotNull
	@Size(min=2,max=3)
	private String estadoCliente;
	
	@NotNull
	private char status;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro = new java.sql.Date(System.currentTimeMillis());

	
	
	//Getters e Setters
	public long getCdCpf() {
		return cdCpf;
	}

	public void setCdCpf(long cdCpf) {
		this.cdCpf = cdCpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getCidadeCliente() {
		return cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}
