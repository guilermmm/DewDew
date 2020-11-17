package vo;

public class ProdutoVO {
	private String titulo;
	private String genero;
	private int ano;
	private int qtdExemplares;
	private double valor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getQtdExemplares() {
		return qtdExemplares;
	}
	public void setQtdExemplares(int qtdExemplares) {
		this.qtdExemplares = qtdExemplares;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
