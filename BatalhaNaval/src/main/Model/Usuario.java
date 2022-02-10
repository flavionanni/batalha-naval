package Model;

public class Usuario extends Jogador {

	public Usuario(String nome, int quantidadeNavios) {
		super(nome, quantidadeNavios);
	}

	public void atirar(int posicaoX, int posicaoY, Mapa mapaDoAlvo, StatusMapa status) {
		mapaDoAlvo.atualizarMapa(posicaoX, posicaoY, status.getStatusMapa());
	}

}
