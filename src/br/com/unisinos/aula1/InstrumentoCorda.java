package br.com.unisinos.aula1;

public abstract class InstrumentoCorda {
	protected String nome;
	protected int numCordas;
	
	public InstrumentoCorda(String nome, int numCordas){
		this.nome = nome;
		this.numCordas = numCordas;
	}

	public abstract void exibirDados();
}