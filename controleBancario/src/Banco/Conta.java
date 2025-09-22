package Banco;

import javax.swing.JOptionPane;

public class Conta {
	
		Cliente cliente;
		private int numeroAgencia;
		private double saldo;
		private int senhaAcesso;
		private int numeroConta;
		private int senhaTransacao;
		private static int totalConta = 1000;

		public Conta (Cliente cliente, int numeroAgencia, double saldo, int senhaAcesso, int senhaTransacao) {
			
			this.cliente = cliente;
			this.numeroAgencia = numeroAgencia;
			this.saldo = saldo;
			this.senhaAcesso = senhaAcesso;
			this.senhaTransacao = senhaTransacao;
			this.numeroConta = totalConta;
			
			totalConta++;
			
		}

		private boolean saque() {
			boolean confirmado = false;
			double valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor"));
			if(this.saldo >= valor) {
				this.saldo -= valor;
				confirmado = true; 
		} else {
			JOptionPane.showMessageDialog(null, 
                    "Saldo insuficiente",  // Mensagem
                    "Saldo",               // Título da janela
                    JOptionPane.INFORMATION_MESSAGE, // Tipo de ícone
                    null);
		}
			return confirmado; 
	}
			private boolean confirmaSenhaTransacao() {
				boolean confirmado = false;
				int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua senha "));
				if (this.senhaTransacao == senha) {
					confirmado = true;
				}
				return confirmado;
			}
			
			
			
			public void confirmaAcesso(int agencia, int conta, int senhaAcesso) {
				if(this.numeroAgencia == agencia && this.numeroConta == conta && this.senhaAcesso == senhaAcesso ) {
				int navegar = 0;
				
				do {
				navegar = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção desejada:" + "\n" + "1 - Ver Saldo" + "\n" +"2- Saque" + "\n" + "5 - Sair"  ));
				if(navegar == 1) {
					verSaldo();
				}
				if(navegar == 2) {
					sacar();
				}
				}while(navegar !=5 );
					
				}
			}
			private void verSaldo() {
				JOptionPane.showMessageDialog(null, "Saldo atual: R$" + this.saldo);
			}
			
			private boolean sacar() {
				boolean confirma = false;
				
				boolean confirmado = confirmaSenhaTransacao();
				
				if(confirmado) {
					
					if(saque()) {
						JOptionPane.showMessageDialog(null, 
			                    "Saque realizado com sucesso",  // Mensagem
			                    "Saldo",               // Título da janela
			                    JOptionPane.INFORMATION_MESSAGE, // Tipo de ícone
			                    null);
						confirma = true;
					}
					
				}else {
					JOptionPane.showMessageDialog(null, 
		                    "Senha inválida",  // Mensagem
		                    "confirma senha",               // Título da janela
		                    JOptionPane.INFORMATION_MESSAGE, // Tipo de ícone
		                    null);
				}
				
				return confirma;
			}
	}

			
		

