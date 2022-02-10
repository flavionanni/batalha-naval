package Controller;

import javax.swing.JOptionPane;

import Model.Jogador;
import Model.Mapa;
import Model.StatusMapa;
import Service.NumeroAleatorioService;
import Validation.CoordenadasValidation;

public class ComputadorController {

	public static void atirar(Mapa mapaDoAlvo, Jogador usuario, Jogador computador) {

		boolean validaTiro, acertouTiro = false;

		String coordenadaX;
		String coordenadaY;

		do {

			coordenadaX = NumeroAleatorioService.gerarNumeroAleatorio(Mapa.getQuantidadeLinhas());
			coordenadaY = NumeroAleatorioService.gerarNumeroAleatorio(Mapa.getQuantidadeColunas());

			JOptionPane.showMessageDialog(null, mapaDoAlvo.mostrarMapa());

			validaTiro = CoordenadasValidation.validarTiro(mapaDoAlvo, Integer.parseInt(coordenadaX),
					Integer.parseInt(coordenadaY));

		} while (!validaTiro);

//		Verifica se o tiro acertou um navio;
		for (String[][] navio : usuario.getNavios()) {
			for (String[] posicaoNavio : navio) {
				if (posicaoNavio[0].equals(coordenadaX) && posicaoNavio[1].equals(coordenadaY)) {
					acertouTiro = true;
				}
			}
		}

		if (acertouTiro) {
			computador.atirar(Integer.parseInt(coordenadaX), Integer.parseInt(coordenadaY),mapaDoAlvo, StatusMapa.NAVIO_ATINGIDO);
			computador.atualizarPontos();
			JOptionPane.showMessageDialog(null, "Coordenadas: [" + coordenadaX + "," + coordenadaY + "] - Afundou o návio!", "Jogada - " + computador.getNome(), JOptionPane.INFORMATION_MESSAGE);
		} else {
			computador.atirar(Integer.parseInt(coordenadaX), Integer.parseInt(coordenadaY),mapaDoAlvo, StatusMapa.TIRO_ERRADO);
			JOptionPane.showMessageDialog(null, "Coordenadas: [" + coordenadaX + "," + coordenadaY + "] - Errou o alvo!", "Jogada - " + computador.getNome(), JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
