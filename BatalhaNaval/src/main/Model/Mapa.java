package Model;

public class Mapa {

	private static int quantidadeLinhas;
	private static int quantidadeColunas;
	private String[][] coordenadasMapa;

	public Mapa(int quantidadeLinhas, int quantidadeColunas) {
		Mapa.quantidadeLinhas = quantidadeLinhas;
		Mapa.quantidadeColunas = quantidadeColunas;
		this.coordenadasMapa = new String[quantidadeLinhas][quantidadeColunas];
		this.gerarMapa();
	}

	public void gerarMapa() {
		for (int linha = 0; linha < this.coordenadasMapa.length; linha++) {
			for (int coluna = 0; coluna < this.coordenadasMapa[linha].length; coluna++) {
				this.coordenadasMapa[linha][coluna] = StatusMapa.MAR.getStatusMapa();
			}
		}
	}

	public String mostrarMapa() {
		String imprimeMapa = "";
		for (int linha = 0; linha < this.coordenadasMapa.length; linha++) {
			imprimeMapa += linha + "       ";
			for (int coluna = 0; coluna < this.coordenadasMapa[linha].length; coluna++) {
				imprimeMapa += this.coordenadasMapa[linha][coluna] + "       ";
			}
			imprimeMapa += "\n";
		}
		return imprimeMapa;
	}

	public void atualizarMapa(int coordenadaX, int coordenadaY, StatusMapa status) {
				this.coordenadasMapa[coordenadaX][coordenadaY] = status.getStatusMapa();
	}

	public static int getQuantidadeLinhas() {
		return quantidadeLinhas;
	}

	public static int getQuantidadeColunas() {
		return quantidadeColunas;
	}

	public String[][] getCoordenadasMapa() {
		return coordenadasMapa;
	}

}
