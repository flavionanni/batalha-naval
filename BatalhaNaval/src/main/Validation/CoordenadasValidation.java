package Validation;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Jogador;
import Model.Mapa;
import Model.StatusMapa;

public class CoordenadasValidation {

	public static boolean validarTiro(Mapa mapaAlvo, Object alvo, int coordenadaX, int coordenadaY) {

		if (coordenadaX < Mapa.getQuantidadeLinhas() && coordenadaY < Mapa.getQuantidadeColunas()) {
			if (mapaAlvo.getCoordenadasMapa()[coordenadaX][coordenadaY] == StatusMapa.MAR.getStatusMapa()) {
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Coordenadas já utilizada");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Coordenadas não encontrada");
			return false;
		}

	}

	public static boolean validarCoordenadasNavio(ArrayList<String[][]> navios, String[][] coordenadasNavio) {

		if (navios.size() > 1) {

			for (String[][] navio : navios) {
				for (String[] posicaoNavio : navio) {
					if (posicaoNavio[0].equals(coordenadasNavio[0][0])
							&& posicaoNavio[1].equals(coordenadasNavio[0][1])) {
						return false;
					}
				}
			}
		}

		return true;
	}

}
