package Controller;

import javax.swing.JTextField;

import Model.Jogador;
import Model.Mapa;
import Validation.CoordenadasValidation;

public class JogadorController {

	public static void atirar(Mapa mapaDoAlvo, Object alvo) {

		JTextField coordenadaX = new JTextField();
		JTextField coordenadaY = new JTextField();

		MapaController.mostrarMapaDeAtaque(mapaDoAlvo, coordenadaX, coordenadaY);
		
		CoordenadasValidation.validarTiro(mapaDoAlvo,((Jogador) alvo),  Integer.parseInt(coordenadaX.getText()), Integer.parseInt(coordenadaY.getText()));
		
		
	}

}
