package Controller;

import java.util.Arrays;

import Model.Computador;
import Model.Mapa;
import Model.Usuario;
import View.DificuldadeDoJogo;
import View.UsuarioView;
import Model.Jogador;

public class JogoComputadorController {

	private static Jogador usuario;
	private static Jogador computador;
	private static Mapa mapaJogador;
	private static Mapa mapaComputador;
	private static int quantidadeDeNavios;

	public static void inicializarJogo() {

		quantidadeDeNavios = DificuldadeDoJogo.escolherDificuldadeDoJogo();
		usuario = new Usuario(UsuarioView.gerarJogador(), quantidadeDeNavios);
		computador = new Computador("Computador", quantidadeDeNavios);
		mapaJogador = MapaController.criarMapaComputador();
		mapaComputador = MapaController.criarMapaComputador();

		usuario.posicionarNavios();
		computador.posicionarNavios();
		turnos();

	}

	public static void turnos() {

		for (int i = 0; i < computador.getNavios().size(); i++) {
			System.out.println(Arrays.deepToString(computador.getNavios().get(i)));
		}

		do {

			JogadorController.atirar(mapaComputador, computador, usuario);
			if (usuario.getQuantidadeDeAcertos() < quantidadeDeNavios) {
				ComputadorController.atirar(mapaJogador, usuario, computador);
			}

		} while (usuario.getQuantidadeDeAcertos() < quantidadeDeNavios
				&& computador.getQuantidadeDeAcertos() < quantidadeDeNavios);
	}

}
