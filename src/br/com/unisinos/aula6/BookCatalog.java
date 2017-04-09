package br.com.unisinos.aula6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BookCatalog implements IBookCatalog{
	private Book[] books;
	private static int index = 0;

	public BookCatalog(int size) {
		books = new Book[size];
	}

	public void load(File file) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] info = line.split(";");
				add(new Book(info[0], info[1], info[2], info[3], Double.parseDouble(info[4])));
			}
		}
	}

	public void list() {
		if (index == 0) {
			System.out.println("Catalogo vazio");
		} else {
			for (int i = 0; i < index; i++) {
				System.out.println(books[i]);
			}
		}
	}

	public void add(Book book) {
		if (index == books.length) {
			System.out.println("Catalogo cheio");
		} else {
			books[index++] = book;
		}
	}

	public void remove(int i) {
		if (i < 0 || i >= index) {
			System.out.println("Index invalido");
		} else {
			for (int j = i; j < index; j++) {
				books[j] = books[j + 1];
			}
			books[--index] = null;
		}
	}

	public void save(File file) throws IOException {
		try (BufferedWriter writer = 
				new BufferedWriter(new FileWriter(file))) {
			for (int i = 0; i < index; i++) {
				writer.write(books[i].texto + ";" + books[i].isbn + ";" + books[i].editora + ";" + books[i].url + ";"
						+ books[i].preco);
				writer.newLine();
			}
		}
	}
}

