package bo;

import java.util.Scanner;

import vo.DiscoVO;
import vo.LivroVO;

public class DiscoBO {
	
	public DiscoVO adicionarDisco() {
		DiscoVO disco = new DiscoVO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Titulo: ");
		disco.setTitulo(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Genero: ");
		disco.setGenero(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Ano: ");
		disco.setAno(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Quantidade de Exemplares: ");
		disco.setQtdExemplares(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Valor: ");
		disco.setValor(sc.nextDouble());
		
		sc = new Scanner(System.in);
		System.out.println("Nome da banda: ");
		disco.setNomeBanda(sc.nextLine());
		
		return disco;
	}
	
	public DiscoVO alterarLivro(DiscoVO disco) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Novo titulo: ");
		disco.setTitulo(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Novo genero: ");
		disco.setGenero(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Novo ano: ");
		disco.setAno(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Nova quantidade de Exemplares: ");
		disco.setQtdExemplares(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Novo valor: ");
		disco.setValor(sc.nextDouble());
		
		sc = new Scanner(System.in);
		System.out.println("Novo nome da banda: ");
		disco.setNomeBanda(sc.nextLine());
		
		return disco;
	}
	
	public void deletarLivro(DiscoVO disco) {
		// provavelmente pelo bd
	}
	
	public void pesquisarLivro(DiscoVO[] disco) {
		// provavelmente pelo bd tambem
	}
}
