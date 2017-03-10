package br.com.unisinos.aula1;

public class FuncionarioComissionado extends Funcionario implements Autenticavel, Exibivel {
	private int vendasMes;
	private int senha;

	public FuncionarioComissionado(double salario, int idade, int vendasMes) {
		super(salario, idade);
		this.vendasMes = vendasMes;
	}

	@Override
	public double calcularSalarioMensal() {
		return salario * 0.1 * vendasMes;
	}

	@Override
	public boolean autenticar(int senha) {
		return this.senha == senha;
	}

	@Override
	public void exibir() {
		System.out.println("Salario: " + salario);
		System.out.println("Quantidade de vendas do Mes: " + vendasMes);
		System.out.println("Senha: " + senha);
	}
}
