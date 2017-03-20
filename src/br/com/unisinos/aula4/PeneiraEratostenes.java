package br.com.unisinos.aula4;

public class PeneiraEratostenes {
	public static void main(String[] args) {
		primos(120);
	}

	public static void primos(int limite) {
		int[] array = new int[limite - 1];
		boolean[] excluidos = new boolean[limite - 1];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 2;
		}
		int maxChecar = (int) Math.sqrt(limite);
		for (int i = 2; i <= maxChecar; i++) {
			for (int j = i + i; j <= limite; j += i) {
				int index = Pesquisa.pesquisaBinaria(array, j);
				if (index > -1 && !excluidos[index]) {
					excluidos[index] = true;
				}
			}
		}
		for (int i = 0; i < excluidos.length; i++) {
			if (!excluidos[i]) {
				System.out.println(array[i]);
			}
		}
	}
}