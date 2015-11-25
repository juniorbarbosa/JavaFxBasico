package br.univel;

import br.univel.util.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PrincipalController {

	@FXML
	private Button btnSalvar;

	@FXML
	private TextField txtCodigo, txtNome;

	@FXML
	private TableView<Pessoa> tabela;

	@FXML
	private void actionSalvar() {
		String codigo = txtCodigo.getText().trim();
		String nome = txtNome.getText().trim();
		if (codigo.isEmpty() || nome.isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Aviso");
			alert.setHeaderText("Aviso importante");
			alert.setContentText("Existem campos vazios.\nTodos os campos são de preenchimento obrigatório.");

			alert.showAndWait();
		} else {
			Pessoa pessoa = new Pessoa();
			pessoa.setCodigo(codigo);
			pessoa.setNome(nome);
			tabela.getItems().add(pessoa);
		}
	}
}
