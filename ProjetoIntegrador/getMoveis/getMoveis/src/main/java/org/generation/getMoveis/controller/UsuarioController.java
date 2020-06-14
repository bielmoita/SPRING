package org.generation.getMoveis.controller;

import java.util.List;

import org.generation.getMoveis.model.Usuario;
import org.generation.getMoveis.repository.UsuarioRepository;
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
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repositoryUsuario;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> GetAll(){
		return ResponseEntity.ok(repositoryUsuario.findAll());
	}
	
	@GetMapping("/{codigoCpf}")
	public ResponseEntity<Usuario> GetById(@PathVariable long codigoCpf){
		return repositoryUsuario.findById(codigoCpf)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nomeCliente}")
	public ResponseEntity<List<Usuario>> GetByNome(@PathVariable String nomeCliente){
		return ResponseEntity.ok(repositoryUsuario.findAllByNomeClienteContainingIgnoreCase(nomeCliente));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> post (@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryUsuario.save(usuario));
	}
	
	@PutMapping
	public ResponseEntity<Usuario> put (@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryUsuario.save(usuario));
	}
	
	@DeleteMapping("/{codigoCpf}")
	public void delete(@PathVariable long codigoCpf) {
		repositoryUsuario.deleteById(codigoCpf);
	}
}
