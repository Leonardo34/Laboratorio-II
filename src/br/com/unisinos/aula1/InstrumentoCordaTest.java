package br.com.unisinos.aula1;

public class InstrumentoCordaTest {

	public static void main(String[] args) {
		 InstrumentoCorda violao = new Violao(7);
		 InstrumentoCorda guitarra = new Guitarra(6);
		 violao.exibirDados();
		 guitarra.exibirDados();
		 
		 System.out.println("");
		 
		 IFigura circulo = new Circulo(5);
		 IFigura quadrado = new Retangulo(5,5);
		 System.out.println(circulo.calcularArea());
		 System.out.println(circulo.calcularPerimetro());
		 System.out.println(quadrado.calcularArea());
		 System.out.println(quadrado.calcularPerimetro());
	}
}
