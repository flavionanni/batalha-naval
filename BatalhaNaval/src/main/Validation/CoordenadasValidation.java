package Validation;

import Model.Jogador;
import Model.Mapa;
import Model.StatusMapa;

public class CoordenadasValidation {

	public static void validarTiro(Mapa mapaAlvo, Object alvo, int coordenadaX, int coordenadaY) {

		if (mapaAlvo.getCoordenadasMapa()[coordenadaX][coordenadaY] == StatusMapa.MAR.getStatusMapa()) {
			System.out.println(((Jogador) alvo).getNavios());
		}

	}

}
