package Model;

import java.util.ArrayList;

import Controller.NavioController;

public class Jogador {

	private static int quantidadeNavios;

	private String nome;
	private int quantidadeDeAcertos = 0;
	private ArrayList<String[][]> navios;

	public Jogador(String nome, int quantidadeNavios) {
		this.nome = nome;
		Jogador.quantidadeNavios = quantidadeNavios;
		this.navios = new ArrayList<>();
	}

	public void posicionarNavios() {
		for (int i = 0; i < quantidadeNavios; i++) {
			
			this.navios.add(NavioController.criarNavio(this.navios));
		}
	}
	
	public void atirar(int posicaoX, int posicaoY) {
		
		
		
	}
	
	public String getNome() {
		return nome;
	}

	public int getQuantidadeDeAcertos() {
		return quantidadeDeAcertos;
	}

	public ArrayList<String[][]> getNavios() {
		return navios;
	}

}
