package br.com.unisinos.aula3;

public class SaldoInsuficienteException extends Exception {
	private double saldo;
	
	public SaldoInsuficienteException(String msg, double saldo) {
		super(msg);
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
}