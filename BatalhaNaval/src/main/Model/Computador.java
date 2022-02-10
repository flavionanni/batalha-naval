package Model;

public class Computador extends Jogador {

	public Computador(String nome, int quantidadeNavios) {
		super(nome, quantidadeNavios);
	}

	public void atirar(int posicaoX, int posicaoY, Mapa mapaDoAlvo, StatusMapa status) {
		mapaDoAlvo.atualizarMapa(posicaoX, posicaoY, status.getStatusMapa());
	
	}

}
