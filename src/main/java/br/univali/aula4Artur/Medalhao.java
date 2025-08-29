package br.univali.aula4Artur;

public class Medalhao implements Acessorio {

	@Override
	public void ativar(Personagem personagem) {
		personagem.recuperar(15);
		System.out.println("Medalhao ativado");
	}
}
