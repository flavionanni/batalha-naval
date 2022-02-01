package Validation;

public class MapaValidation {
	
	public static boolean verificaTamanhoDoMapa(int tamanhoLinha, int tamanhoColuna) {
		
		if(tamanhoLinha > 10 || tamanhoColuna > 10) {
			System.out.println("O tamanho máximo do mapa é 10x10");
			return false;
		}
		
		return true;
	}
	
}
