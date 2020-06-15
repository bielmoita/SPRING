package com.generation.clinica.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.clinica.model.MedicoModel;

@Repository
public interface MedicoRepository extends JpaRepository<MedicoModel, String> {
	public List<MedicoModel> findAllByNomeContainingIgnoreCase(String nome);
}
