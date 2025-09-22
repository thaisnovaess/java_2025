package Banco;

public class Cliente {
	private String nomeCliente;
	private String cpfCliente;
	private String telefoneCliente;
	public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
		
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	
	
	
	
}

