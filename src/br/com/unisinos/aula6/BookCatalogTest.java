package br.com.unisinos.aula6;

import java.io.File;
import java.io.IOException;

public class BookCatalogTest {
	public static void main(String[] args) {
		IBookCatalog catalogo = new BookCatalog(10);
		catalogo.list();
		File file = new File("F:/Programacao II/book.txt");
		try {
			catalogo.load(file);
			catalogo.list();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catalogo.add(new Book("teste", "teste", "teste", "teste", 50));
		catalogo.remove(0);
		catalogo.list();
		
		try {
			catalogo.save(new File("F:/Programacao II/DB.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

