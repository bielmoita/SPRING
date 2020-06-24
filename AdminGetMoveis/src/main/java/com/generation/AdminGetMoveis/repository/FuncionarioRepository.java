package com.generation.AdminGetMoveis.repository;

import com.generation.AdminGetMoveis.model.Funcionario;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	public Optional<Funcionario> findByFuncionario(String funcionario);

}
