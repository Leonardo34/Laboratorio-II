package br.com.unisinos.aula6;

import java.io.File;
import java.io.IOException;

public interface IBookCatalog {
	public void load(File file) throws IOException;
	public void list();
	public void add(Book book);
	public void remove(int i);
	public void save(File file) throws IOException;
}
