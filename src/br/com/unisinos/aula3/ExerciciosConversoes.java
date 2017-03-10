package br.com.unisinos.aula3;

public class ExerciciosConversoes {
	public static void main(String[] args) {
		ExerciciosConversoes exerciciosConversoes = new ExerciciosConversoes();
		exerciciosConversoes.imprimeTabelaAsc();
		//exerciciosConvercao.biRebaixado();
		//exerciciosConvercao.fazerConvercoes();
	}
	
	
	public void imprimeTabelaAsc() {
		for (char i = 0; i < 64; i++) {
			for (char j = i; j < 256; j += 64) {
				System.out.print((int) j + " : " + j + "         ");
			}
			System.out.println();
		}
	}
	
	public void biRebaixado() {
		char[] frase = {73, 77, 79, 82, 84, 65, 76, 32, 84, 82, 73, 67, 79, 76, 79, 82};

		for (char letra : frase) {
			System.out.print(letra);
		}
	}
	
	public void fazerConversoes() {
		char ex1= 255;
		int widening = ex1;
		double ex2 = 10000.00;
		int narrowing = (int) ex2;
		Character ex3 = new Character('a');
		char boxing = ex3;
		int ex4 = 256;
		Integer unboxing = ex4;
		String conversaoString = String.valueOf(ex1 + ex2);
		//int parse = Integer.parseInt(conversaoString);
		byte declaracao = (byte) 255;
		double casting = (double) 25/2;
		short s = (short) 50000; 
		System.out.println(s);
	}
}