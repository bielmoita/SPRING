package com.generation.AdminGetMoveis.repository;

import java.util.List;

import com.generation.AdminGetMoveis.model.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
	public List<Produtos> findAllByNomeContainingIgnoreCase(String nome);

}
