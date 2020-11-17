package vo;

public class LivroVO extends ProdutoVO{
	private int qtdPaginas;
	private String autor;
	
	public LivroVO() {
		
	}
	
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
