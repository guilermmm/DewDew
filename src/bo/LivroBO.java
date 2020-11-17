package bo;

import java.util.Scanner;

import vo.ClienteVO;
import vo.LivroVO;

public class LivroBO {
	public LivroVO adicionarLivro() {
		LivroVO livro = new LivroVO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Titulo: ");
		livro.setTitulo(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Genero: ");
		livro.setGenero(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Ano: ");
		livro.setAno(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Quantidade de Exemplares: ");
		livro.setQtdExemplares(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Valor: ");
		livro.setValor(sc.nextDouble());
		
		sc = new Scanner(System.in);
		System.out.println("Autor: ");
		livro.setAutor(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Quantidade de Páginas: ");
		livro.setQtdPaginas(sc.nextInt());
		
		return livro;
	}
	
	public LivroVO alterarLivro(LivroVO livro) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Novo titulo: ");
		livro.setTitulo(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Novo genero: ");
		livro.setGenero(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Novo ano: ");
		livro.setAno(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Nova quantidade de Exemplares: ");
		livro.setQtdExemplares(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Novo valor: ");
		livro.setValor(sc.nextDouble());
		
		sc = new Scanner(System.in);
		System.out.println("Novo autor: ");
		livro.setAutor(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Nova quantidade de Páginas: ");
		livro.setQtdPaginas(sc.nextInt());
		
		return livro;
	}
	
	public void deletarLivro(LivroVO livro) {
		// provavelmente pelo bd
	}
	
	public void pesquisarLivro(LivroVO[] livro) {
		// provavelmente pelo bd tambem
	}
}
