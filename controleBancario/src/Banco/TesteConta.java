package Banco;

public class TesteConta {
	public static void main(String[] args) {
		
		Cliente cli01 = new Cliente ("Ismael", "123.456.789-05", "(11)9.5432-9876");
		Cliente cli02 = new Cliente ("Waldir", "123.456.789-05", "(11)9.5432-9876");
		
		Conta cc1 = new Conta( cli01, 100, 1000, 1234, 123);
		String nome = cc1.cliente.getNomeCliente();
		System.out.println(nome);
		
		cc1.confirmaAcesso(100, 1000, 1234);
	}
}
