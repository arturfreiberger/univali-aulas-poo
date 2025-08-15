package br.univali;

public class Principal {

	public static void main(String[] args) {

		Arma arma = new Arma("Pistola", 12, 1.5);
		RoboExterminador robo = new RoboExterminador("EXTERMINADOR", 3.56, 150, arma);
		Robo robo2 = new Robo("Angela", 1.15, 75, null);
		System.out.println(robo.getNome());
		System.out.println(robo.getAltura());
		System.out.println(robo.getPeso());
		robo.recarregar();
		robo.atirar();
		robo.acenar();
		robo.correr();
		robo2.correr();

	}

}
