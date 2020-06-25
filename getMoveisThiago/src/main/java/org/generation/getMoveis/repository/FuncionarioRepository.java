package org.generation.getMoveis.repository;

import java.util.List;
import java.util.Optional;

import org.generation.getMoveis.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	public List<Funcionario> findAllByNomeFuncionarioContainingIgnoreCase(String codigoCpf);
	public Optional<Funcionario> findByFuncionario(String funcionario);

}
