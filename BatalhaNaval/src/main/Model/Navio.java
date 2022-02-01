package Model;

import Service.NumeroAleatorioService;

public class Navio {
	
	private String[][] coordenadasNavio = new String[1][2];
	

	public String[][] gerarCoordenadasNavio() {
//		Coordenada X
		this.coordenadasNavio[0][0] = NumeroAleatorioService.gerarNumeroAleatorio(Mapa.getQuantidadeLinhas());
//		Coordenada Y
		this.coordenadasNavio[0][1] = NumeroAleatorioService.gerarNumeroAleatorio(Mapa.getQuantidadeColunas());

		return coordenadasNavio;
	}

	public String[][] getCoordenadasNavio() {
		return coordenadasNavio;
	}
	
}
