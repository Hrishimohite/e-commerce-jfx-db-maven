package org.dnyanyog.choicescreen;

import org.dnyanyog.login.LoginScreen;
import org.dnyanyog.productmanagment.ProductManagement;
import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ChoiceScreenController {

	@FXML
	Button userManagement;

	@FXML
	Button productManagement;

	@FXML
	Button quit;

	public void userManagementButtonClick() throws Exception {
		new UserManagement().show();
		
	}

	public void productManagementButtonClick() throws Exception {
		new ProductManagement().show();
	}
	public void backButtonClick() throws Exception {
		new LoginScreen().show();
	}

	
}