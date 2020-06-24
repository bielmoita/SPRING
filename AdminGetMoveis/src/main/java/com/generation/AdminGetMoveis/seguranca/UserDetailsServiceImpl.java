package com.generation.AdminGetMoveis.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.AdminGetMoveis.model.Funcionario;
import com.generation.AdminGetMoveis.repository.FuncionarioRepository;
import com.generation.AdminGetMoveis.seguranca.UserDetailsImpl;

import java.util.Optional;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private FuncionarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		Optional<Funcionario> user = userRepository.findByFuncionario(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException(userName+ " not found."));
		
		return user.map(UserDetailsImpl::new).get();
	}

}
