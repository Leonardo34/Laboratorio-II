package br.com.unisinos.aula2;

public class Computador extends Dispositivo implements Instalavel {
	private int index;
	private double velocidade;
	private Periferico perifericos[];
	private static final int MAX_PERIFERICOS = 10;

	public static void main(String[] args) {
		Periferico mouse = new Mouse(1, "Genius", 3);
		Periferico printer = new Impressora(1, "HP Deskjet", true);
		Computador samsung = new Computador(3, "Samsung", 4);

		System.out.println(samsung.instalar(mouse));
		System.out.println(samsung);
		System.out.println(samsung.instalar(printer));
		System.out.println(samsung);
		System.out.println(samsung.instalar(printer));
		System.out.println(samsung);
		System.out.println(samsung.desinstalar(printer));
		System.out.println(samsung);
		System.out.println(mouse.equals(printer));
	}

	public Computador(int id, String modelo, double velocidade) {
		super(id, modelo);
		this.velocidade = velocidade;
		perifericos = new Periferico[MAX_PERIFERICOS];
	}

	@Override
	public boolean instalar(Periferico periferico) {
		if (index == MAX_PERIFERICOS) {
			return false;
		}
		for (int i = 0; i < index; i++) {
			if (perifericos[i].equals(periferico)) {
				return false;
			}
		}
		perifericos[index++] = periferico;
		return true;
	}

	@Override
	public boolean desinstalar(Periferico periferico) {
		for (int i = 0; i < index; i++) {
			if (perifericos[i].equals(periferico)) {
				for (int j = i; j < index - 1; j++) {
					perifericos[j] = perifericos[j + 1];
				}
				perifericos[--index] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "Modelo: " + getModelo() + " Velocidade: " + velocidade + "\n";
		for (int i = 0; i < index; i++) {
			s += perifericos[i].toString();
		}
		return s;
	}
}
