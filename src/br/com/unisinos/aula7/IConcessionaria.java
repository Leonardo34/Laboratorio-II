package br.com.unisinos.aula7;

import java.io.File;
import java.io.IOException;

public interface IConcessionaria {
	public void load(File file) throws IOException;
	public void list();
	public boolean add(Carro carro);
	public Carro remove(int index);
	public void save(File file) throws IOException;
}
