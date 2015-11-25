package br.univel.util;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pessoa {

	private final StringProperty codigo = new SimpleStringProperty();
	private final StringProperty nome = new SimpleStringProperty();

	public String getCodigo() {
		return codigo.get();
	}

	public void setCodigo(String value) {
		codigo.set(value);
	}

	public StringProperty codigoProperty() {
		return codigo;
	}

	public String getNome() {
		return nome.get();
	}

	public void setNome(String value) {
		nome.set(value);
	}

	public StringProperty nomeProperty() {
		return nome;
	}

}
