package generation.hotel.model;

public class UsuarioLogado {
	
	//São as informações que vamos devolver para o usuario após o Login
	private String token;
	private Long codigo;
	private String nome;
	private String email;
	
	//Getters e Setters
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
