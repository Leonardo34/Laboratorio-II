package br.com.unisinos.aula2;

public class Mouse extends Periferico{
	private int botoes;
	
	public Mouse (int id, String modelo, int botoes) {
		super (id, modelo);
		this.botoes = botoes;
	}
	
	@Override
	public String toString () {
		return "\nModelo: " + getModelo() + " Id: " + getId() + " Botoes: " + botoes;
	}
}
