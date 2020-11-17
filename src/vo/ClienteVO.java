package vo;

public class ClienteVO extends PessoaVO{
	private DiscoVO[] aluguelAtivoDisco;
	private LivroVO[] aluguelAtivoLivro;
	
	public ClienteVO() {
		
	}

	public DiscoVO[] getAluguelAtivoDisco() {
		return aluguelAtivoDisco;
	}

	public void setAluguelAtivoDisco(DiscoVO[] aluguelAtivoDisco) {
		this.aluguelAtivoDisco = aluguelAtivoDisco;
	}

	public LivroVO[] getAluguelAtivoLivro() {
		return aluguelAtivoLivro;
	}

	public void setAluguelAtivoLivro(LivroVO[] aluguelAtivoLivro) {
		this.aluguelAtivoLivro = aluguelAtivoLivro;
	}

	
}

