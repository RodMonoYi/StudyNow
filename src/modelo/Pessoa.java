package modelo;

public class Pessoa {
	
	public static String nome;
	public static String cpf;
	public static String login;
	public static String senha;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Pessoa.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		Pessoa.cpf = cpf;
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		Pessoa.login = login;
	}
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		Pessoa.senha = senha;
	}
	public Pessoa(String nome, String cpf, String login, String senha) {
		super();
		Pessoa.nome = nome;
		Pessoa.cpf = cpf;
		Pessoa.login = login;
		Pessoa.senha = senha;
	}
	
	

}
