package org.generation.getMoveis.repository;

import java.util.List;

import org.generation.getMoveis.model.Usuario_Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioCompraRepository extends JpaRepository<Usuario_Compra, Long>{
	//public List<Usuario_Compra> findAllByCodigoUsuarioCompraContainingIgnoreCase(String codigoUsuarioCompra);

}
