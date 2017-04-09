package br.com.unisinos.aula7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Concessionaria implements IConcessionaria {
	private List<Carro> carros = new ArrayList<>();

	@Override
	public void load(File file) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] info = line.split(";");
				add(new Carro(info[0], info[1], Double.parseDouble(info[2]), Integer.parseInt(info[3])));
			}
		}
	}

	@Override
	public void list() {
		Collections.sort(carros);
		for (Carro car : carros) {
			System.out.println(car);
		}
	}

	@Override
	public boolean add(Carro carro) {
		if (carros.contains(carro)) {
			return false;
		}
		carros.add(carro);
		return true;
	}

	@Override
	public Carro remove(int index) {
		if (index < 0 || index >= carros.size()) {
			return null;
		}
		return carros.remove(index);
	}

	@Override
	public void save(File file) throws IOException {
		try (BufferedWriter writer = 
				new BufferedWriter(new FileWriter(file))) {
			for (Carro car : carros) {
				writer.write(car.toString());
				writer.newLine();
			}
		}
	}

}
