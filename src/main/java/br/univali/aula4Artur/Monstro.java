package br.univali.aula4Artur;

public class Monstro extends Personagem {


	public Monstro(String nome, int hp, int ataque, int defesa) {
		super(nome, hp, ataque, defesa);
	}

	public void patrulhar() {
		System.out.println(getNome() + " Patrulhando...");
	}

	public void defender() {
		System.out.println(getNome() + " se esquiva");
	}
}
