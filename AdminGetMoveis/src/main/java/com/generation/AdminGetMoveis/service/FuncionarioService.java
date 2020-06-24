package com.generation.AdminGetMoveis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.generation.AdminGetMoveis.model.Funcionario;
import com.generation.AdminGetMoveis.model.UserLogin;
import com.generation.AdminGetMoveis.repository.FuncionarioRepository;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;


@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repository;
	
	public Funcionario cadastrarfuncionario(Funcionario funcionario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(funcionario.getSenha());
		
		funcionario.setSenha(senhaEncoder);
		
		return repository.save(funcionario);
	}
	
	public Optional<UserLogin> Logar(Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		Optional<Funcionario> funcionario = repository.findByFuncionario(user.get().getUsuario());
		
		if(funcionario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), funcionario.get().getSenha())) {
				
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodeAuth);
				
				user.get().setToken(authHeader);
				//setToken(authHeader);
				user.get().setNome(funcionario.get().getNomeFuncionario());
				
				return user;
			}
		}
		
		return null;
	}

}
