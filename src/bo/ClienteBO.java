package bo;

import java.util.Scanner;
import vo.ClienteVO;

public class ClienteBO {
	public ClienteVO cadastrarCliente(){
		ClienteVO cliente = new ClienteVO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: ");
		cliente.setNome(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Endereço: ");
		cliente.setEndereco(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("CPF: ");
		cliente.setCpf(sc.nextLine());
		
		return cliente;
	}
	
	public ClienteVO alterarCliente(ClienteVO cliente) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Novo nome: ");
		cliente.setNome(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Novo endereço: ");
		cliente.setEndereco(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Novo CPF: ");
		cliente.setCpf(sc.nextLine());
		
		return cliente;
	}
	
	public void deletarCliente(ClienteVO cliente) {
		// provavelmente pelo bd
	}
	
	public void pesquisarCliente(ClienteVO[] cliente) {
		// provavelmente pelo bd tambem
	}
}
