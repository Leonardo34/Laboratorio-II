package br.com.unisinos.aula1;

public class Violao extends InstrumentoCorda {

	public Violao(int numCordas) {
		super("Violao", numCordas);
	}

	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Numero de cordas: " + this.numCordas);
	}
}
