package com.generation.AdminGetMoveis.controller;

import java.util.Optional;

import com.generation.AdminGetMoveis.model.Funcionario;
import com.generation.AdminGetMoveis.model.UserLogin;
import com.generation.AdminGetMoveis.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
@CrossOrigin("*")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> funcionario){
		return funcionarioService.Logar(funcionario).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Funcionario> Post(@RequestBody Funcionario funcionario) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(funcionarioService.cadastrarfuncionario(funcionario));
	}

}
