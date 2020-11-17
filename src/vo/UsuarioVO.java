package vo;

public class UsuarioVO extends PessoaVO{
	String login;
	String senha;
	
	public UsuarioVO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
