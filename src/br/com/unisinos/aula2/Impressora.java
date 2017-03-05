package br.com.unisinos.aula2;

public class Impressora extends Periferico {
	private boolean color;
	
	public Impressora (int id, String modelo, boolean color) {
		super (id, modelo);
		this.color = color = color;
	} 
	
	@Override
	public String toString () {
		return "\nModelo: " + getModelo() + " Id: " + getId() + " Colorida: " + color;
	}
}