package br.com.unisinos.aula7;

import java.io.File;
import java.io.IOException;

public class ConcessionariaTest {
	public static void main(String[] args) {
		IConcessionaria concessionaria = new Concessionaria();

		try {
			concessionaria.load(new File("F:/Programacao II/Carros.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		concessionaria.list();

		concessionaria.add(new Carro("AAA-1111", "Ferrari", 1_500_000, 2016));

		concessionaria.list();

		Carro carro = concessionaria.remove(0);
		if (carro != null) {
			System.out.println("Removido: " + carro);
		} else {
			System.out.println("Carro nao encontrado!");
		}

		try {
			concessionaria.save(new File("F:/Programacao II/CarrosOut"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

