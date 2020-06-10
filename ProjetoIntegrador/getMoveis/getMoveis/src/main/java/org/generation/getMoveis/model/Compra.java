package org.generation.getMoveis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "TB_COMPRA")
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoDaCompra;
	
	private float valorTotal;
	
	private int tiposDeProdutos;
	
}
