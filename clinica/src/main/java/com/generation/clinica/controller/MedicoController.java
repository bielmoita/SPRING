package com.generation.clinica.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.clinica.model.MedicoModel;
import com.generation.clinica.repository.MedicoRepository;

@RestController
@RequestMapping("/medico")
@CrossOrigin("*")
public class MedicoController {
	
	@Autowired
	private MedicoRepository repositoryMedico;
	
	//GET
	//Pegando a médico pelo código
	@GetMapping("/{crm}")
	public ResponseEntity<MedicoModel> GetById(@PathVariable String crm)
	{
		return repositoryMedico.findById(crm)
				.map(resp-> ResponseEntity.ok(resp)).
				orElse(ResponseEntity.notFound().build());
				
	}
	
	
	@GetMapping
	public ResponseEntity<List<MedicoModel>> getAll(){
		return ResponseEntity.ok(repositoryMedico.findAll());
	}
	
	@GetMapping("/medico/{nome}")
	public ResponseEntity<List<MedicoModel>>
	getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(repositoryMedico.
				findAllByNomeContainingIgnoreCase(nome));
		}
		
	
	//POST
	@PostMapping
	public ResponseEntity<MedicoModel> Post
	(@RequestBody MedicoModel medico){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repositoryMedico.save(medico));
	}
	
	//PUT
	@PutMapping
	public ResponseEntity<MedicoModel> Put
	(@RequestBody MedicoModel medico){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repositoryMedico.save(medico));
	}
	
	
	//Delete
	@DeleteMapping("/{crm}")
	public void delete(@PathVariable String crm) {
		repositoryMedico.deleteById(crm);
	}
	

}
