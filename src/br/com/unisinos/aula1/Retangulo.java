package br.com.unisinos.aula1;

public class Retangulo implements IFigura {

	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return (base + altura) * 2;
	}
}
