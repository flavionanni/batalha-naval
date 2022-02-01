package View;

import javax.swing.JOptionPane;

public class Menu {
	
	
	public static void menuPrincipal() {
		
		String menuPrincipal;
		
		menuPrincipal = (String) JOptionPane.showInputDialog(null,
				"1 - Jogar\n" +
				"2 - Instruções\n" +
				"3 - Sair\n" +
				"Escolha uma opção", "Batalha Naval", JOptionPane.INFORMATION_MESSAGE);
	
		switch (menuPrincipal) {
		case "1":
			ModoDoJogo.escolhaDoModoDoJogo();
			break;

		default:
			break;
		}
		
	}
	
}
