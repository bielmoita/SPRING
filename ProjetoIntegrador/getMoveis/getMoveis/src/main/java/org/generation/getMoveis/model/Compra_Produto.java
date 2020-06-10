package org.generation.getMoveis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compra_Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="compra_codigoDaCompra")
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name="produto_codigoDoProduto")	
	private Produto produto;

	
}
