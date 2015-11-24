package br.univel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrincipalController {

	@FXML
	private Button btnSalvar;
	
	@FXML
	private TextField txtCodigo, txtNome;
	
	@FXML
	private void actionSalvar() {
		System.out.println(txtCodigo.getText() + " - " + txtNome.getText());
	}

}
