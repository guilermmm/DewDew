package bo;

import java.util.Scanner;
import vo.UsuarioVO;

public class UsuarioBO {
	public UsuarioVO novoUsuario() {
		UsuarioVO user = new UsuarioVO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: ");
		user.setNome(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Endereço: ");
		user.setEndereco(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("CPF: ");
		user.setCpf(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Login: ");
		user.setLogin(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Senha: ");
		user.setSenha(sc.next());
		
		return user;
	}
	
	public void fazerLogin(UsuarioVO user) {
		UsuarioVO usu = new UsuarioVO();
		boolean check = false;
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Login: ");
		usu.setLogin(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Senha: ");
		usu.setSenha(sc.nextLine());
		
		if (usu.getLogin().equals(user.getLogin()) && usu.getSenha().equals(user.getSenha())) {
			check = true;
			System.out.println("Logado!");
		}
		}while (check == false);
		
	}
}