package br.com.unisinos.aula4;

public class ClassificacaoTest {
	public static void main(String[] args) {
		int[] dado = {1_000, 5_000, 10_000, 50_000, 100_000, 250_000, 500_000};
		for (int i = 0; i < dado.length; i++) {
			benchmark(dado[i]);
		}
	}
	
	public static int[] gerarArray(int tam) {
		int[] array = new int[tam];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * tam);
		}
		return array;
	}
	
	public static void benchmark(int tamanho) {
		int[] array = gerarArray(tamanho);
		System.out.println("Bubble sort");
		System.out.println("Tamanho array: "+ tamanho);
		long start = System.currentTimeMillis();
		Classificacao.bubbleSort(array.clone());
		long ms = System.currentTimeMillis() - start;
		System.out.println("Tempo transcorrido: " + ms);
		
		System.out.println("Inserction Sort");
		System.out.println("Tamanho array: "+ tamanho);
		long startInsertion = System.currentTimeMillis();
		Classificacao.insertionSort(array.clone());
		long msInsertion = System.currentTimeMillis() - startInsertion;
		System.out.println("Tempo transcorrido: " + msInsertion);
		
		System.out.println("Selection Sort");
		System.out.println("Tamanho array: "+ tamanho);
		long startSelection = System.currentTimeMillis();
		Classificacao.selectionSort(array.clone());
		long msSelection = System.currentTimeMillis() - startSelection;
		System.out.println("Tempo transcorrido: " + msSelection);
	}
/* Resultado Benchmark
* 
* 
Bubble sort
Tamanho array: 1000
Tempo transcorrido: 21
Inserction Sort
Tamanho array: 1000
Tempo transcorrido: 5
Selection Sort
Tamanho array: 1000
Tempo transcorrido: 4
Bubble sort
Tamanho array: 5000
Tempo transcorrido: 28
Inserction Sort
Tamanho array: 5000
Tempo transcorrido: 14
Selection Sort
Tamanho array: 5000
Tempo transcorrido: 10
Bubble sort
Tamanho array: 10000
Tempo transcorrido: 103
Inserction Sort
Tamanho array: 10000
Tempo transcorrido: 11
Selection Sort
Tamanho array: 10000
Tempo transcorrido: 36
Bubble sort
Tamanho array: 50000
Tempo transcorrido: 2889
Inserction Sort
Tamanho array: 50000
Tempo transcorrido: 262
Selection Sort
Tamanho array: 50000
Tempo transcorrido: 872
Bubble sort
Tamanho array: 100000
Tempo transcorrido: 11603
Inserction Sort
Tamanho array: 100000
Tempo transcorrido: 1045
Selection Sort
Tamanho array: 100000
Tempo transcorrido: 3473
Bubble sort
Tamanho array: 250000
Tempo transcorrido: 72006
Inserction Sort
Tamanho array: 250000
Tempo transcorrido: 6542
Selection Sort
Tamanho array: 250000
Tempo transcorrido: 21564
Bubble sort
Tamanho array: 500000
Tempo transcorrido: 286081
Inserction Sort
Tamanho array: 500000
Tempo transcorrido: 26257
Selection Sort
Tamanho array: 500000
Tempo transcorrido: 86039
*/
}

