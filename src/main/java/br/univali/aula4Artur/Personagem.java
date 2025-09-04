package br.univali.aula4Artur;

import java.util.Objects;

public class Personagem {

	private int ataque;
	private int defesa;
	private int hp;
	private String nome;
	private Arma arma;
	private Acessorio[] acessorios;

	public Personagem(String nome, int hp, int ataque, int defesa) {
		this.nome = nome;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
		this.acessorios = new Acessorio[3];
	}

	public void atacar(Personagem personagem) {
		System.out.println(this.nome + " ataca " + personagem.nome);
	}

	public void atacar(Monstro monstro) {
		int dano = this.ataque + arma.getAtaque();
		for (String fraqueza : monstro.getFraquezas()) {
			String elemento = arma.getElemento();
			if (fraqueza.equals(elemento)) {
				System.out.println("Double Damage");
				dano = dano * 2;
			}
		}
		// causar dano
	}

	public void defender() {
		System.out.println(this.nome + " defende");
	}

	public void recuperar(int valor) {
		if (valor >= 0) {
			this.hp += valor;
			System.out.println(this.nome + " recupera " + valor + " hp");
		}
	}

	public String getNome() {
		return nome;
	}

	public void addAcessorio(Acessorio acessorio, int slot) {
		this.acessorios[slot] = acessorio;
	}

	public void usarAcessorio(int slot) {
		this.acessorios[slot].ativar(this);
	}

	public void equipar(Arma arma) {
		this.arma = arma;
	}

}
