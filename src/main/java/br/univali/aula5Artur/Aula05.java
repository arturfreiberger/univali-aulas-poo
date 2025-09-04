package br.univali.aula5Artur;

import br.univali.aula4Artur.*;

public class Aula05 {

	public static void main(String[] args) {

		Monstro m = new Monstro("Shinryu", 40, 16, 18);

		m.addFraqueza(new String("Omega"));
		System.out.println(m);

		Arma arma = new Arma("Omega", 14, new String("Omega"));
		Personagem p = new Personagem("Zenos", 70, 34, 54);
		p.equipar(arma);
		p.atacar(m);

	}

}
