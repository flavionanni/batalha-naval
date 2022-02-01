package Controller;

import java.awt.Component;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import Model.Computador;
import Model.Mapa;
import Validation.MapaValidation;

public class MapaController {

	public static void criarMapaMultiplayer(int quantidadeLinhas, int quantidadeColunas) {

		boolean validacaoTamanhoDoMapa = false;

		Scanner input = new Scanner(System.in);

		do {

			try {

				System.out.print("Digite a quantidade de linhas do mapa: ");
				quantidadeLinhas = input.nextInt();

				System.out.print("Digite a quantidade de colunas do mapa: ");
				quantidadeColunas = input.nextInt();

				validacaoTamanhoDoMapa = MapaValidation.verificaTamanhoDoMapa(quantidadeLinhas, quantidadeColunas);

			} catch (InputMismatchException error) {
				System.out.println("Por favor, digite apenas números.");
				input.nextLine();
			}

		} while (!validacaoTamanhoDoMapa);

		Mapa jogador01 = new Mapa(quantidadeLinhas, quantidadeColunas);
		jogador01.gerarMapa();

	}

	public static Mapa criarMapaComputador() {

		return new Mapa(5, 5);

	}

	public static void mostrarMapaDeAtaque(Mapa mapaAdversario, JTextField coordenadaX, JTextField coordenadaY) {
		
		UIManager.put("OptionPane.yesButtonText", "ATIRAR");
		UIManager.put("OptionPane.noButtonText", "SAIR");
		
		Object[] coordenadas = { mapaAdversario.mostrarMapa() + "\n" + "Coordenada X:", coordenadaX, "Coordenada Y:", coordenadaY};
		
		int opcao = JOptionPane.showConfirmDialog(null, coordenadas, "BATALHA NAVAL", JOptionPane.OK_OPTION, JOptionPane.OK_OPTION);
	}

}
