package br.univali.aula4Artur;

public class Arma {

	private String nome;
	private int ataque;
	private String elemento;

	public Arma(String nome, int ataque, String elemento) {
		this.nome = nome;
		this.ataque = ataque;
		this.elemento = elemento;
	}

	public int getAtaque() {
		return ataque;
	}

	public String getElemento() {
		return elemento;
	}
}
