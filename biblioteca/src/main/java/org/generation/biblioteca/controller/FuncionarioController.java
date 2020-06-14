package org.generation.biblioteca.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.generation.biblioteca.model.Funcionario;
import org.generation.biblioteca.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")
@CrossOrigin("*")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository repositoryFuncionario;
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> GetAll(){
		return ResponseEntity.ok(repositoryFuncionario.findAll());
	}
	
	@GetMapping("/{cdFuncionario}")
	public ResponseEntity<Funcionario> GetById(@PathVariable long cdFuncionario){
		return repositoryFuncionario.findById(cdFuncionario)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomes/{nomeFuncionario}")
	public ResponseEntity<List<Funcionario>> GetByTitulo(@PathVariable String nomeFuncionario){
		return ResponseEntity.ok(repositoryFuncionario.findAllByNomeFuncionarioContainingIgnoreCase(nomeFuncionario));		
	}
	
	@PostMapping
	public ResponseEntity<Funcionario> post (@RequestBody Funcionario funcionario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryFuncionario.save(funcionario));
	}
	
	@PutMapping
	public ResponseEntity<Funcionario> put (@RequestBody Funcionario funcionario){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryFuncionario.save(funcionario));
	}
	
	@DeleteMapping("/{cdFuncionario}")
	public void delete (@PathVariable long cdFuncionario) {
		repositoryFuncionario.deleteById(cdFuncionario); 
	}

}
