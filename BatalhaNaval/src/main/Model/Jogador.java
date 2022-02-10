package Model;

import java.util.ArrayList;

import Controller.NavioController;

public abstract class Jogador {

	private int quantidadeNavios;
	private String nome;
	private int quantidadeDeAcertos = 0;
	private ArrayList<String[][]> navios;

	public Jogador(String nome, int quantidadeNavios) {
		this.nome = nome;
		this.quantidadeNavios = quantidadeNavios;
		this.navios = new ArrayList<>();

	};

	public void posicionarNavios() {
		for (int i = 0; i < quantidadeNavios; i++) {
			this.navios.add(NavioController.criarNavio(this.navios));
		}
	}

	public abstract void atirar(int posicaoX, int posicaoY, Mapa mapaDoAlvo, StatusMapa status);

	public String getNome() {
		return nome;
	}

	public int getQuantidadeDeAcertos() {
		return quantidadeDeAcertos;
	}

	public void atualizarPontos() {
		this.quantidadeDeAcertos += 1;
	}

	public int getQuantidadeNavios() {
		return quantidadeNavios;
	}

	public void setNavios(ArrayList<String[][]> navios) {
		this.navios = navios;
	}

	public ArrayList<String[][]> getNavios() {
		return navios;
	}

}
