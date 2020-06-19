package generation.hotel.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import generation.hotel.model.Usuario;

public class UserDetailsImpl implements UserDetails{
	
	private static final long serialVersionUID=1L;
	private Long codigo;
	private String nome;
	private String email;
	private String senha;
	private boolean isAccountNonExpired;
	private boolean isCredentialNonExpired;
	private boolean isAccountNotLocked;
	private boolean isEnabled;
	
	//Construtor
	public UserDetailsImpl(Usuario usuario) {
		this.codigo = usuario.getCodigo();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		
		this.isAccountNotLocked=true;
		this.isCredentialNonExpired=true;
		this.isEnabled=true;
		this.isAccountNonExpired=true;
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return senha;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return isAccountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return isAccountNotLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return isCredentialNonExpired;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return isEnabled;
	}
	
	//Apenas Getters que precisamos

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	

}
