package br.com.unisinos.aula1;

public class Guitarra extends InstrumentoCorda {

	public Guitarra(int numCordas) {
		super("Guitarra", numCordas);
	}

	@Override
	public void exibirDados(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Numero de Cordas: " + this.numCordas);
	}
}
