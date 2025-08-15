package br.univali;

public class Arma {

	private String nome;
	private int capacidade;
	private int numeroBalas;
	private double alcance;

	public Arma(String nome, int capacidade, double alcance) {
		this.nome = nome;
		this.capacidade = capacidade;
		this.alcance = alcance;
		this.numeroBalas = 0;
	}

	public void recarregar() {
		this.numeroBalas = capacidade;
		System.out.println("Recarregando " + capacidade + " Balas");
	}

	public void atirar() {
		if (numeroBalas == 0) {
			System.out.println("Sem munição");
			return;
		}
		numeroBalas--;
		System.out.println("Atirando com Arma");

	}
}
