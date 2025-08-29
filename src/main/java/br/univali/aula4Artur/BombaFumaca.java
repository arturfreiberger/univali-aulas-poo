package br.univali.aula4Artur;

public class BombaFumaca implements Acessorio {

	@Override
	public void ativar(Personagem personagem) {
		System.out.println(personagem.getNome() + " foge da luta");
	}
}
