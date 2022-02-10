package View;

import javax.swing.JOptionPane;

import Controller.JogoComputadorController;

public class ModoDoJogoView {
	
	public static void escolhaDoModoDoJogo() {
		
		String modoDoJogo;
		
		do {
		
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
			JOptionPane.showMessageDialog(null, "Opção Inválida! - Digite um número válido.", "Opção Inválida", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
		}while(!modoDoJogo.equals("3"));
	}
	
		
}
