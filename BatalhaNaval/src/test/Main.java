import java.util.Arrays;
import java.util.Scanner;

import Controller.MapaController;
import Model.Usuario;
import View.MenuView;

public class Main {

	public static void main(String[] args) {
		
		MenuView.menuPrincipal();
		
		Scanner input = new Scanner(System.in);

		MapaController.criarMapaMultiplayer(10, 11);

		System.out.print("Digite a quantidade de navios: ");
		int quantidadeDeNavios = input.nextInt();

		Usuario jogador = new Usuario("Flavio", quantidadeDeNavios);

		jogador.posicionarNavios();

//		mapa.gerarMapa();

//		mapa.mostrarMapa();

		for (int i = 0; i < jogador.getNavios().size(); i++) {
			System.out.println(Arrays.deepToString(jogador.getNavios().get(i)));
		}

	}
}
