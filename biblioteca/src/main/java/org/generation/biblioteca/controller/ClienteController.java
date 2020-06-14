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

import org.generation.biblioteca.model.Cliente;
import org.generation.biblioteca.repository.ClienteRepository;


@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repositoryCliente;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> GetAll(){
		return ResponseEntity.ok(repositoryCliente.findAll());
	}
	
	@GetMapping("/{cdCpf}")
	public ResponseEntity<Cliente> GetById(@PathVariable long cdCpf){
		return repositoryCliente.findById(cdCpf)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomes/{nomeCliente}")
	public ResponseEntity<List<Cliente>> GetByTitulo(@PathVariable String nomeCliente){
		return ResponseEntity.ok(repositoryCliente.findAllByNomeClienteContainingIgnoreCase(nomeCliente));		
	}
	
	@PostMapping
	public ResponseEntity<Cliente> post (@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCliente.save(cliente));
	}
	
	@PutMapping
	public ResponseEntity<Cliente> put (@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryCliente.save(cliente));
	}
	
	@DeleteMapping("/{cdCpf}")
	public void delete (@PathVariable long cdCpf) {
		repositoryCliente.deleteById(cdCpf); 
	}

}
