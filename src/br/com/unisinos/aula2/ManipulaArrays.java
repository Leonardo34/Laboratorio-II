package br.com.unisinos.aula2;

public class ManipulaArrays {

	public static void main(String[] args) {
		ManipulaArrays manipulaArrays = new ManipulaArrays();
		int[][] matri = { { 4, 1, 2 }, { 3, 2, 1 }, { 5, 8, 6 } };

		int[][] matriz = manipulaArrays.gerarMatrizIlluminati(5);
		// manipulaArrays.exibirMatriz(matriz);
		System.out.println(manipulaArrays.media(matri));
		System.out.println(manipulaArrays.mediaLinha(matri, 1));
		int[] array = manipulaArrays.gerarArrayUnidimensional(matri);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void exibirMatriz(int[][] matriz) {
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				System.out.print(matriz[line][column] + " ");
			}
			System.out.println();
		}
	}

	public int[][] lerTeclado() {
		Teclado t = new Teclado();
		int numberLines = t.leInt();
		int numberColumns = t.leInt();
		int[][] matriz = new int[numberLines][numberColumns];
		for (int line = 0; line < numberLines; line++) {
			for (int column = 0; column < numberColumns; column++) {
				matriz[line][column] = t.leInt();
			}
		}
		return matriz;
	}

	public int[][] gerarNumeroAleatorios() {
		int numberLines = (int) (Math.random() * 10);
		int numberColumns = (int) (Math.random() * 10);
		int[][] matriz = new int[numberLines][numberColumns];
		for (int line = 0; line < numberLines; line++) {
			for (int column = 0; column < numberColumns; column++) {
				matriz[line][column] = (int) (Math.random() * 100);
			}
		}
		return matriz;
	}

	public double media(int[][] matriz) {
		int totalMatriz = 0, totalElements = 0;
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				totalMatriz += matriz[line][column];
				totalElements++;
			}
		}
		if (totalElements == 0) {
			return 0;
		}
		return (double) totalMatriz / totalElements;
	}

	public int maiorValor(int[][] matriz) {
		int maiorValor = 0;
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				if (matriz[line][column] > maiorValor) {
					maiorValor = matriz[line][column];
				}
			}
		}
		return maiorValor;
	}

	public double mediaLinha(int[][] matriz, int line) {
		int totalLine = 0;
		for (int column = 0; column < matriz[line].length; column++) {
			totalLine += matriz[line][column];
		}
		if (matriz[line].length == 0) {
			return 0;
		}
		return (double) totalLine / matriz[line].length;
	}

	public boolean pesquisar(int[][] matriz, int n) {
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				if (matriz[line][column] == n) {
					return true;
				}
			}
		}
		return false;
	}

	public int[] gerarArrayUnidimensional(int[][] matriz) {
		int[] array = new int[matriz.length * matriz[0].length];
		int indexArray = 0;
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				array[indexArray++] = matriz[line][column];
			}
		}
		return array;
	}

	public int[][] gerarMatrizIlluminati(int numberLines) {
		int[][] matriz = new int[numberLines][numberLines];
		for (int line = 0; line < numberLines; line++) {
			for (int column = line, number = 1; column < numberLines; column++, number++) {
				matriz[line][column] = number;
			}
		}
		return matriz;
	}
}
