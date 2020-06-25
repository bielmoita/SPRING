package org.generation.getMoveis.controller;

import java.util.List;
import java.util.Optional;

import org.generation.getMoveis.model.UserLogin;
import org.generation.getMoveis.model.Funcionario;
import org.generation.getMoveis.repository.FuncionarioRepository;
import org.generation.getMoveis.service.FuncionarioService;
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

@RestController
@RequestMapping("/funcionarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user){
		return funcionarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Funcionario> Post(@RequestBody Funcionario funcionario){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(funcionarioService.CadastrarFuncionario(funcionario));
	}
	
	@Autowired
	private FuncionarioRepository repositoryFuncionario;
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> GetAll(){
		return ResponseEntity.ok(repositoryFuncionario.findAll());
	}
	
	@GetMapping("/{idFuncionario}")
	public ResponseEntity<Funcionario> GetById(@PathVariable long idFuncionario){
		return repositoryFuncionario.findById(idFuncionario)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nomeFuncionario}")
	public ResponseEntity<List<Funcionario>> GetByNome(@PathVariable String nomeFuncionario){
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
	
	@DeleteMapping("/{idFuncionario}")
	public void delete(@PathVariable long idFuncionario) {
		repositoryFuncionario.deleteById(idFuncionario);
	}
	
	

}
