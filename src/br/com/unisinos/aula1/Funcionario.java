package br.com.unisinos.aula1;

public abstract class Funcionario {
	protected double salario;
	protected int idade;
	
	public Funcionario(double salario, int idade) {
		this.salario = salario;
		this.idade = idade;
	}
	
	public void fazerAniversario() {
		this.idade++;
	}
	
	public abstract double calcularSalarioMensal();
}