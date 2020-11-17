package vo;

public class AluguelVO {
	
	private ClienteVO cliente;
	private double valor;
	private String data;
	
	public AluguelVO() {
		
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		String date[] = data.split("/");
		
		int idate[] = {0,0,0};
		for (int i = 0; i < date.length; i++) {
			idate[i] = Integer.parseInt(date[i]);  
		} // conversão de string para int
		
		if ( idate[0] > 31 || idate[0] <= 0 || idate[1] > 12 || idate[1] <= 0 || idate[2] > 2020 || 
				idate[2] <= 0) 
			System.out.println("Data inválida, utilizar formato dd/mm/aaaa");
		else if (idate[1] == 02 && idate[0] > 29) 
			System.out.println("Data inválida, fevereiro tem apenas 29 dias.");
		else
			System.out.println("ok");
			this.data = data;
	}
	
	
}
