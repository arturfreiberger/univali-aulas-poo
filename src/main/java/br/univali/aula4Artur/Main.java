package br.univali.aula4Artur;

public class Main {

	public static void main(String[] args) {

		Personagem p1 = new Personagem("Squall", 11, 12, 13);
		Personagem p2 = new Personagem("Rinoa", 4, 2, 20);

		Acessorio bomba = new BombaFumaca();
		Acessorio medalhao = new Medalhao();

		p2.addAcessorio(bomba, 0);
		p1.addAcessorio(medalhao, 1);
		p1.atacar(p2);
		p1.usarAcessorio(1);
		p2.usarAcessorio(0);

		Monstro m = new Monstro("Omega", 40, 16, 18);

		m.patrulhar();
		m.defender();

	}

}
