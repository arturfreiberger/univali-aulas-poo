package br.univali.aula4Artur;

import java.util.ArrayList;
import java.util.List;

public class Monstro extends Personagem {

	private List<String> fraquezas;

	public Monstro(String nome, int hp, int ataque, int defesa) {
		super(nome, hp, ataque, defesa);
		fraquezas = new ArrayList<String>();
	}

	public void patrulhar() {
		System.out.println(getNome() + " Patrulhando...");
	}

	public void defender() {
		System.out.println(getNome() + " se esquiva");
	}

	public void addFraqueza(String fraqueza) {
		fraquezas.add(fraqueza);
	}

	public String toString() {
		return getNome() + " " + fraquezas;
	}

	public List<String> getFraquezas() {
		return fraquezas;
	}
}
