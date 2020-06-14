package org.generation.getMoveis.repository;

import java.util.List;

import org.generation.getMoveis.model.Compra_Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraProdutoRepository extends JpaRepository<Compra_Produto, Long>{
	//public List<Compra_Produto> findAllByCodigoCompraProdutoContainingIgnoreCase(String codigoCompraProduto);
}
