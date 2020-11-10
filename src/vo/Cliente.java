package vo;

public class Cliente {
	private String nome;
	private String endereço;
	private String cpf;
	
	public Cliente() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() < 14 || cpf.length() > 14 || cpf == null || !cpf.substring(0, 3).matches("[1-9]") || !cpf.substring(3, 4).matches("[.]") ||
				!cpf.substring(4, 7).matches("[1-9]")	|| !cpf.substring(7, 8).matches("[.]") || !cpf.substring(8, 11).matches("[1-9]") || !cpf.substring(11, 12).matches("[-]")
				|| !cpf.substring(12, 14).matches("[1-9]*")) {
			System.out.println("Cpf inválido, favor utilizar o formato xxx.xxx.xxx-xx");
		}
		else {
			this.cpf = cpf;
		}
	}
	
}

