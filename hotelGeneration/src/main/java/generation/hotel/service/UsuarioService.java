package generation.hotel.service;

import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import generation.hotel.model.Usuario;
import generation.hotel.model.UsuarioLogado;
import generation.hotel.model.UsuarioLogin;
import generation.hotel.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repositoryUsuario;
	
	public Usuario cadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		return repositoryUsuario.save(usuario);
	}
	
	//---------------------------------------------
	
	public Optional<UsuarioLogado> Logar(UsuarioLogin usuarioLogin) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		Optional<Usuario> usuario = repositoryUsuario.findByEmail(usuarioLogin.getEmail());
		
		if(usuario.isPresent()==false)
		{
			return Optional.empty();
		}
		if(encoder.matches(usuarioLogin.getSenha(), usuario.get().getSenha()) == false) {
			return Optional.empty();
		}
		
		//Criando o Token
		String auth = usuarioLogin.getEmail()+":"+usuarioLogin.getSenha();
		String enconding = Base64.getEncoder().encodeToString(auth.getBytes());
		String authHeader = "Basic "+ enconding;
		
		//Criando uma instancia do objeto UsuarioLogado
		UsuarioLogado usuarioLogado = new UsuarioLogado();
		usuarioLogado.setCodigo(usuario.get().getCodigo());
		usuarioLogado.setNome(usuario.get().getNome());
		usuarioLogado.setEmail(usuario.get().getEmail());
		usuarioLogado.setToken(authHeader);
		
		return Optional.ofNullable(usuarioLogado);
	}

}
