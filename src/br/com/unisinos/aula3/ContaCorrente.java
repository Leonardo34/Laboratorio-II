package br.com.unisinos.aula3;

public class ContaCorrente {
	private String nomeCorrentista;
	private double saldo;

	public ContaCorrente(String nomeCorrentista, double saldo) {
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Saldo Insuficiente", saldo);
		}
		saldo -= valor;
	}

	public void depositar(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException("Voce nao pode depositar este valor");
		}
		saldo += valor;
	}

	@Override
	public String toString() {
		return "Nome Correntista: " + nomeCorrentista + "\nSaldo: " + saldo;
	}
}
