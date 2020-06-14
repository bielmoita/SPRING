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
@Table(name = "tb_livro")
public class Livro {
	
	@Id
	private long cdIsbn;
	
	@NotNull
	@Size(min=3,max=120)
	private String nomeLivro;
	
	@NotNull
	@Size(min=12,max=120)
	private String autorLivro;
	
	@NotNull
	@Size(min=3,max=120)
	private String editoraLivro;
	
	@NotNull
	private int paginasLivro;
	
	@NotNull
	private char statusLivro;
	
	//Getters e Setters

	public long getCdIsbn() {
		return cdIsbn;
	}

	public void setCdIsbn(long cdIsbn) {
		this.cdIsbn = cdIsbn;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public String getEditoraLivro() {
		return editoraLivro;
	}

	public void setEditoraLivro(String editoraLivro) {
		this.editoraLivro = editoraLivro;
	}

	public int getPaginasLivro() {
		return paginasLivro;
	}

	public void setPaginasLivro(int paginasLivro) {
		this.paginasLivro = paginasLivro;
	}

	public char getStatusLivro() {
		return statusLivro;
	}

	public void setStatusLivro(char statusLivro) {
		this.statusLivro = statusLivro;
	}
	
	

}
