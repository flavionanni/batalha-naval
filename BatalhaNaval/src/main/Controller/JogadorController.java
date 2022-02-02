package Controller;

import javax.swing.JTextField;

import Model.Jogador;
import Model.Mapa;
import Model.StatusMapa;
import Validation.CoordenadasValidation;

public class JogadorController {

	public static void atirar(Mapa mapaDoAlvo, Object alvo) {

		JTextField coordenadaX = new JTextField();
		JTextField coordenadaY = new JTextField();
		boolean validaTiro, acertouTiro = false;

		do {

			MapaController.mostrarMapaDeAtaque(mapaDoAlvo, alvo, coordenadaX, coordenadaY);

			validaTiro = CoordenadasValidation.validarTiro(mapaDoAlvo, ((Jogador) alvo),
					Integer.parseInt(coordenadaX.getText()), Integer.parseInt(coordenadaY.getText()));

		} while (!validaTiro);

//		Verifica se o tiro acertou um navio;
		for (String[][] navio : ((Jogador) alvo).getNavios()) {
			for (String[] posicaoNavio : navio) {
				if (posicaoNavio[0].equals(coordenadaX.getText()) && posicaoNavio[1].equals(coordenadaY.getText())) {
					acertouTiro = true;
				}
			}
		}

		if (acertouTiro) {
			mapaDoAlvo.atualizarMapa(Integer.parseInt(coordenadaX.getText()), Integer.parseInt(coordenadaY.getText()),
					StatusMapa.NAVIO_ATINGIDO);
		} else {
			mapaDoAlvo.atualizarMapa(Integer.parseInt(coordenadaX.getText()), Integer.parseInt(coordenadaY.getText()),
					StatusMapa.TIRO_ERRADO);
		}

	}

}
