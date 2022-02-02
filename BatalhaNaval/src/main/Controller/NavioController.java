package Controller;

import java.util.ArrayList;

import Model.Navio;
import Validation.CoordenadasValidation;

public class NavioController {

	public static String[][] criarNavio(ArrayList<String[][]> navios) {

		Navio navio = new Navio();
		Boolean validacaoCoordenadas;
		String[][] coordenadasNavio;
		
		do {

			coordenadasNavio = navio.gerarCoordenadasNavio();
			validacaoCoordenadas = CoordenadasValidation.validarCoordenadasNavio(navios, coordenadasNavio);

		} while (!validacaoCoordenadas);

		return coordenadasNavio;
	}

}
