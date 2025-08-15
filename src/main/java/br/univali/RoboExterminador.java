package br.univali;

public class RoboExterminador extends Robo {

	private  Arma arma;

	public RoboExterminador(String nome, double altura, double peso, Arma arma) {
		super(nome, altura, peso, arma);
		this.arma = arma;
	}


	public void atirar() {
		arma.atirar();
	}

	public void recarregar() {
		arma.recarregar();
	}

	public void correr() {
		String nome = getNome();
		System.out.println("Robo " + nome + " correndo agressivamente");
	}

}
