package org.generation.getMoveis.repository;
import java.util.List;

import org.generation.getMoveis.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{
	//public List<Compra> findAllByCodigoDaCompraContainingIgnoreCase(int codigoDaCompra);
	


}