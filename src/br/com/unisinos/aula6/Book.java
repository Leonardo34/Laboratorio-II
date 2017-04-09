package br.com.unisinos.aula6;

public class Book {
	public String texto;
	public String isbn;
	public String editora;
	public String url;
	public double preco;
	
	public Book(String texto, String isbn, String editora, String url, double preco) {
		this.texto = texto;
		this.isbn = isbn;
		this.editora = editora;
		this.url = url;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		String s = "Texto: " + texto + "\n";
		s += "isbn: " + isbn + "\n";
		s += "editora: " + editora + "\n";
		s += "url: " + url + "\n";
		s += "Preco: " + preco + "\n";
		return s;
	}
}
