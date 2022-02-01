package View;

import javax.swing.JOptionPane;

public class DificuldadeDoJogo {

	public static Model.DificuldadeDoJogo dificuldadeDoJogo;

	public static int escolherDificuldadeDoJogo() {
		dificuldadeDoJogo = (Model.DificuldadeDoJogo) JOptionPane.showInputDialog(null, "Escolha uma dificuldade",
				"Dificuldade", JOptionPane.QUESTION_MESSAGE, null, Model.DificuldadeDoJogo.values(),
				Model.DificuldadeDoJogo.MEDIO);

		return dificuldadeDoJogo.getQuantidadeDeNavios();

	}
}
