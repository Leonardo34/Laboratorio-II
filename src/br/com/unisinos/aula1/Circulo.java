package br.com.unisinos.aula1;

public class Circulo implements IFigura {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return raio * raio * Math.PI;
	}

	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
}
