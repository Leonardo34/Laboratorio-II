package br.com.unisinos.aula5;

public class ExercRecursao {
	public static void main(String[] args) {
		fibonacci(20);
		System.out.println(somaInteiros(9));
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(somaArray(array));
		System.out.println(somaAlgarismos(5248));
		System.out.println(maximoDivisorComum(1440, 408));
		System.out.println(isPalindromo("REVIVER"));
		System.out.println(isPalindromo("TESTE"));
		System.out.println(isPalindromo("Socorram-me subi no onibus em Marrocos"));
		System.out.println(buscaMaior(array));
	}
	
	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static int somaInteiros(int n) {
		if (n == 1) {
			return n;
		}
		return n + somaInteiros(n - 1);
	}
	
	public static int somaInteirosPares(int n) {
		if (n % 2 == 0) {
			return somaInteirosParesR(n);
		}
		return somaInteirosParesR(n - 1);
	}
	
	private static int somaInteirosParesR(int n) {
		if (n == 2) {
			return n;
		}
		return n + somaInteirosPares(n - 2);
	}
	
	public static int somaArray(int[] array) {
		return somaArrayRec(array, 0, 0);
	}

	private static int somaArrayRec(int[] array, int index) {
		if (index == array.length - 1) {
			return array[index];
		}
		return array[index] + somaArrayRec(array, index + 1);
	}
	
	private static int somaArrayRec(int[] array, int sum, int index) {
		if (index == array.length) {
			return sum;
		}
		return somaArrayRec(array, sum + array[index], ++index);
	}
	
	public static int somaAlgarismos(int n) {
		return somaAlgarismos(n, 0);
	}

	public static int somaAlgarismosR(int n) {
		if ( n < 10)
			return n;
		return n % 10 + somaAlgarismosR(n / 10);
	}
	
	private static int somaAlgarismos(int num, int sum) {
		if (num < 1) {
			return sum;
		}
		return somaAlgarismos(num/10, sum + num % 10);
	}
	
	public static int maximoDivisorComum(int a, int b) {
		if (b == 0) {
			return a;
		}
		return maximoDivisorComum(b, a % b);
	}
	
	public static boolean isPalindromo(String s) {
		String replaced = s.replaceAll(" ", "").replaceAll("-", "").toLowerCase();
		return isPalindromo(replaced, 0, replaced.length() - 1);
	}
	
	private static boolean isPalindromo(String s, int base, int limit) {
		if (base >= limit) {
			return true;
		}
		if (s.charAt(base) != s.charAt(limit)) {
			return false;
		}
		return isPalindromo(s, ++base, --limit);
	}
	
	public static void inverterArray(int[] array) {
		inverterArray(array, 0, array.length - 1);
	}
	
	private static void inverterArray(int[] array, int base, int limit) {
		if (base < limit) {
			int aux = array[base];
			array[base] = array[limit];
			array[limit] = aux;
			inverterArray(array, base + 1, limit - 1);
		}
	}
	
	public static int buscaMaior(int[] array) {
		return buscaMaior(array, 0, array.length - 1);
	}
	
	private static int buscaMaior(int[] array, int base, int limit, int max) {
		if (base > limit) {
			return max;
		}
		int m = Math.max(array[base], array[limit]);
		if (m > max) {
			return buscaMaior(array, ++base, --limit, m);
		}
		return buscaMaior(array, ++base, --limit, max);
	}
	
	private static int buscaMaior(int[] array, int base, int limit) {
		if (base == limit) {
			return array[base];
		}
		int media = (base + limit) / 2; 
		return Math.max(buscaMaior(array, base, media), buscaMaior(array, media + 1, limit));
	}
	
	public static void fractalR(int length) {
		fractalR(length, 0);
	}

	private static void fractalR(int length, int column) {
		if (length > 0) {
			for (int i = 0; i < column; i++) {
				System.out.print("*");
			}
			for (int i = 0; i < length; i++) {
				System.out.print(" ");
			}
		}
	}
}
