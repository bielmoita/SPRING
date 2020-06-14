package org.generation.biblioteca.repository;

import java.util.List;

import org.generation.biblioteca.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	public List<Funcionario> findAllByNomeFuncionarioContainingIgnoreCase(String nomeFuncionario);
}
