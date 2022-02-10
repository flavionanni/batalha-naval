package Validation;

import javax.swing.JOptionPane;

public class BotoesValidation {

	public static boolean verificaBotaoCancelar(String umaString, String umTitulo, String umaMensagem) {
		if (umaString == null) {
			JOptionPane.showMessageDialog(null, umaMensagem, umTitulo, JOptionPane.INFORMATION_MESSAGE);
			return true;
		}
		return false;
	}

	public static boolean verificaBotaoVoltar(String umaString) {
		if (umaString == null) {
			return true;
		}
		return false;
	}
}
