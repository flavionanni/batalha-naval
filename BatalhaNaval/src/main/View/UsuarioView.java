package View;

import javax.swing.JOptionPane;

public class UsuarioView {

	public static String gerarJogador() {
		
		String informacoesJogador = (String) JOptionPane.showInputDialog(null, "Nome: ", "Informações do Jogador", JOptionPane.INFORMATION_MESSAGE);
		
		return informacoesJogador;
	}
	
	
	
}
