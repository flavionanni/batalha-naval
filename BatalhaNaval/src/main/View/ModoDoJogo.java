package View;

import javax.swing.JOptionPane;

import Controller.JogoComputadorController;

public class ModoDoJogo {
	
	public static void escolhaDoModoDoJogo() {
		
		String modoDoJogo;
		
		modoDoJogo = (String) JOptionPane.showInputDialog(null,
				"1 - Multiplayer (Mesma máquina)\n" +
				"2 - Computador\n" +
				"Escolha uma opção:", "Modo do Jogo", JOptionPane.INFORMATION_MESSAGE
			);
		
		switch (modoDoJogo) {
		case "1":
			
			break;
		case "2":
			JogoComputadorController.inicializarJogo();
			break;
			
		default:
			break;
		}
		
	}
	
}
