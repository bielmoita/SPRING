package com.generation.AdminGetMoveis.seguranca;

import java.util.Collection;

import com.generation.AdminGetMoveis.model.Funcionario;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javassist.SerialVersionUID;

public class UserDetailsImpl implements UserDetails {
	
private static final long SerialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	public UserDetailsImpl(Funcionario user) {
		this.userName = user.getNomeFuncionario();
		this.password = user.getSenha();
		
	}
	
	public UserDetailsImpl() {
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	

}
