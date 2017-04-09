package br.com.unisinos.aula7;

public class Carro implements Comparable<Carro> {
	private String placa;
	private String nome;
	private double preco;
	private int ano;
	
	public Carro(String placa, String nome, double preco, int ano) {
		this.placa = placa;
		this.nome = nome;
		this.preco = preco;
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	@Override
	public int compareTo(Carro carro) {
		return placa.compareTo(carro.getPlaca());
	}
	
	@Override
	public String toString() {
		return placa + ";" + nome + ";" + preco + ";" + ano;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Carro car = (Carro) obj;
		return placa.equals(car.placa);
	}
}
