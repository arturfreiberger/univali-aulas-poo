package br.univali;

public class Robo {

	private String nome;
	private double altura;
	private double peso;
	private Arma arma;

	public Robo(String novoNome, double novaAltura, double novoPeso, Arma novaArma) {
		nome = novoNome;
		altura = novaAltura;
		peso = novoPeso;
		arma = novaArma;
	}

	public String getNome() {
		return nome;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public void correr() {
		System.out.println("Robo " + nome + " correndo");
	}

	public void acenar() {
		System.out.println("Robo " + nome + " acenando");
	}

}