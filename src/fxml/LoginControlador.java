package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	@FXML
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("gleybsonlopes91@gmail.com");
		boolean senhaValida = campoSenha.getText().equals("teste123");
		
		if(emailValido && senhaValida) {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login JXML")
			.text("Login efetuado com sucesso")
			.showInformation();
			
		}else{
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login JXML")
			.text("Falha ao logar! ")
			.showError();
		}
	}

}
