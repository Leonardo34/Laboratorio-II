package br.com.unisinos.aula2;

public abstract class Dispositivo {
	private int id;
	private String modelo;
	
	public Dispositivo (int id, String modelo) {
		this.id = id;
		this.modelo = modelo;
	}
	
	public int getId () {
		return id;
	}
	
	public String getModelo () {
		return modelo;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		return this.id == ((Dispositivo) obj).getId();
	}
}
