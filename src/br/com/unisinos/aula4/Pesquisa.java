package br.com.unisinos.aula4;

public class Pesquisa {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		//System.out.println(pesquisaSequencial(array, 6));
		//System.out.println(pesquisaSequencialOrdenada(array, 6));
		//System.out.println(pesquisaBinaria(array, 6));
		Integer[] a = {1, 2, 3, 5, 6, 8, null};
		inserirOrdenado(a, 4);
		inserirOrdenado(a, 12);
		inserirOrdenado(a, 1);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static int pesquisaSequencial(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static int pesquisaSequencialOrdenada(int[] a, int x) {
		for (int i = 0; i < a.length && a[i] <= x; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static int pesquisaBinaria(int[] a, int x) {
		int inf = 0;
		int sup = a.length - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (x == a[med])
				return med;
			else if (x < a[med])
				sup = med - 1;
			else
				inf = med + 1; 
		}
		return -1;
	}

	public static void inserirOrdenado(Integer[] array, int n) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null || n < array[i]) {
				insertAt(i, n, array);
				return;
			}
		}
	}
	
	private static void insertAt(int index, int n, Integer[] array) {
		for (int i = array.length - 2; i >= index; i--) {
			array[i + 1] = array[i];
		}
		array[index] = n;
	}
}

