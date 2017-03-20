package br.com.unisinos.aula4;

public class Classificacao {
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i;
			int B = a[i];
			while ((j > 0) && (a[j - 1] > B)) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = B;
		}
	}

	public static void bubbleSort(int[] a) {
		int i = a.length - 1;
		while (i > 0) {
			int last = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					last = j;
				}
			}
			i = last;
		}
	}

	public static void selectionSort(int[] a) {
		int min = 0;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[j] < a[min])
					min = j;
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}

}

