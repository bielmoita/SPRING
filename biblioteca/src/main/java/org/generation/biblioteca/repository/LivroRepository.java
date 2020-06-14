package org.generation.biblioteca.repository;

import java.util.List;

import org.generation.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	public List<Livro> findAllByNomeLivroContainingIgnoreCase(String nomeLivro);

}
