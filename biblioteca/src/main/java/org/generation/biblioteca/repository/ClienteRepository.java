package org.generation.biblioteca.repository;

import java.util.List;

import org.generation.biblioteca.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	public List<Cliente> findAllByNomeClienteContainingIgnoreCase(String nomeCliente);
}
