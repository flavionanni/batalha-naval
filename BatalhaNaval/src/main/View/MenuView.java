package View;

import javax.swing.JOptionPane;

import Validation.BotoesValidation;

public class MenuView {

	public static void menuPrincipal() {

		String menuPrincipal;

		do {

			menuPrincipal = (String) JOptionPane.showInputDialog(null,
					"1 - Jogar\n" + 
					"2 - Instruções\n" + 
					"3 - Sair\n" + 
					"Escolha uma opção", "Batalha Naval",
					JOptionPane.INFORMATION_MESSAGE);
			
			if(BotoesValidation.verificaBotaoCancelar(menuPrincipal, "BATALHA NAVAL", "FIM DE JOGO!")) {
				return;
			}
			
			switch (menuPrincipal) {
			case "1":
				ModoDoJogoView.escolhaDoModoDoJogo();
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida! - Digite um número válido.", "Opção Inválida", JOptionPane.ERROR_MESSAGE);
				break;
			}

		} while (true);

	}

}
