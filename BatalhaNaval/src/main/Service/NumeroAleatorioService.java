package Service;

import java.util.Random;

public class NumeroAleatorioService {

	public static String gerarNumeroAleatorio(int quantidadeMaxima) {

		Random gerarNumero = new Random();

		return Integer.toString(gerarNumero.nextInt(Math.abs(quantidadeMaxima)));
	}

}
