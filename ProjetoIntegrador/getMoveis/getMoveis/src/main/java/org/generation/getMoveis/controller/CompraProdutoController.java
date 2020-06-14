package org.generation.getMoveis.controller;

import java.util.List;

import org.generation.getMoveis.model.Compra_Produto;
import org.generation.getMoveis.repository.CompraProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compraproduto")
@CrossOrigin("*")
public class CompraProdutoController {
	
	@Autowired
	private CompraProdutoRepository repositoryCompraProduto;
	
	@GetMapping
	public ResponseEntity<List<Compra_Produto>> GetAll(){
		return ResponseEntity.ok(repositoryCompraProduto.findAll());
	}
	
	@GetMapping("/{codigoCompraProduto}")
	public ResponseEntity<Compra_Produto> GetById(@PathVariable long codigoCompraProduto){
		return repositoryCompraProduto.findById(codigoCompraProduto)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	//@GetMapping("/nome/{codigoCompraProduto}")
	//public ResponseEntity<List<Compra_Produto>> GetByNome(@PathVariable String codigoCompraProduto){
		//return ResponseEntity.ok(repositoryCompraProduto.findAllByCodigoCompraProdutoContainingIgnoreCase(codigoCompraProduto));
	//}
	
	//@PostMapping
	//public ResponseEntity<Compra_Produto> post (@RequestBody Compra_Produto compraProduto){
		//return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCompraProduto.save(compraProduto));
	//}
	
	//@PutMapping
	//public ResponseEntity<Compra_Produto> put (@RequestBody Compra_Produto compraProduto){
		//return ResponseEntity.status(HttpStatus.OK).body(repositoryCompraProduto.save(compraProduto));
	//}
	
	@DeleteMapping("/{codigoCompraProduto}")
	public void delete(@PathVariable long codigoCompraProduto) {
		repositoryCompraProduto.deleteById(codigoCompraProduto);
	}

}
