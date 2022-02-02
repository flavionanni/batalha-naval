package Controller;

import java.util.Arrays;

import Model.Computador;
import Model.Jogador;
import Model.Mapa;
import View.DificuldadeDoJogo;

public class JogoComputadorController {

	private static Jogador jogador;
	private static Computador computador;
	private static Mapa mapaJogador;
	private static Mapa mapaComputador;

	public static void inicializarJogo() {

		int quantidadeDeNavios = DificuldadeDoJogo.escolherDificuldadeDoJogo();
		jogador = new Jogador(View.Jogador.gerarJogador(), quantidadeDeNavios);
		computador = new Computador(new Jogador("Computador", quantidadeDeNavios));
		mapaJogador = MapaController.criarMapaComputador();
		mapaComputador = MapaController.criarMapaComputador();
		jogador.posicionarNavios();
		computador.getComputador().posicionarNavios();
		turnos();

	}

	public static void turnos() {

		for (int i = 0; i < computador.getComputador().getNavios().size(); i++) {
			System.out.println(Arrays.deepToString(computador.getComputador().getNavios().get(i)));
		}

		JogadorController.atirar(mapaComputador, computador.getComputador());

	}

}
