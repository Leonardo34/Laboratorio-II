package br.com.unisinos.aula3;

public class TestaContaCorrente {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente("Leonardo", 500);
		try {
			contaCorrente.sacar(600);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage() + "\nSeu saldo é de: " + e.getSaldo());
		} 
		
		try {
			contaCorrente.depositar(-10);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(contaCorrente);
	}
}
