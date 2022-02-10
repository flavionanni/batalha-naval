package Controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.Jogador;
import Model.Mapa;
import Model.StatusMapa;
import Validation.CoordenadasValidation;

public class JogadorController {

	public static void atirar(Mapa mapaDoAlvo, Jogador alvo, Jogador usuario) {

		JTextField coordenadaX = new JTextField();
		JTextField coordenadaY = new JTextField();
		boolean validaTiro, acertouTiro = false;
		
		do {

			MapaController.mostrarMapaDeAtaque(mapaDoAlvo, alvo, coordenadaX, coordenadaY);

			validaTiro = CoordenadasValidation.validarTiro(mapaDoAlvo, Integer.parseInt(coordenadaX.getText()),
					Integer.parseInt(coordenadaY.getText()));

		} while (!validaTiro);

//		Verifica se o tiro acertou um navio;
		for (String[][] navio : alvo.getNavios()) {
			for (String[] posicaoNavio : navio) {
				if (posicaoNavio[0].equals(coordenadaX.getText()) && posicaoNavio[1].equals(coordenadaY.getText())) {
					acertouTiro = true;
				}
			}
		}

		if (acertouTiro) {
			usuario.atirar(Integer.parseInt(coordenadaX.getText()), Integer.parseInt(coordenadaY.getText()),
					mapaDoAlvo, StatusMapa.NAVIO_ATINGIDO);
			usuario.atualizarPontos();
			JOptionPane.showMessageDialog(null,
					"Coordenadas: [" + coordenadaX.getText() + "," + coordenadaY.getText() + "] - Afundou o návio!", "Jogada - " + usuario.getNome(), JOptionPane.INFORMATION_MESSAGE);
		} else {
			usuario.atirar(Integer.parseInt(coordenadaX.getText()), Integer.parseInt(coordenadaY.getText()),
					mapaDoAlvo, StatusMapa.TIRO_ERRADO);
			JOptionPane.showMessageDialog(null,
					"Coordenadas: [" + coordenadaX.getText() + "," + coordenadaY.getText() + "] - Errou o alvo!",  "Jogada - " + usuario.getNome(), JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
