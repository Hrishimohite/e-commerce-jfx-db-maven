package org.dnyanyog.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.dnyanyog.choicescreen.ChoiceScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreenController {
	String url = "jdbc:mysql://localhost:3307/ecommerce_management_scenebuilder";
	String userName = "root";
	String password_db = "mohite@123";

	@FXML
	TextField loginName;

	@FXML
	TextField password;

	@FXML
	Label errorMessage;

	public void loginButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url, userName, password_db); 
		Statement statement = connection.createStatement();

		String query = "select * from ecommerce_management_scenebuilder.users where userName ='" + loginName.getText()
				+ "' and userPassword='" + password.getText() + "';";

		ResultSet result = statement.executeQuery(query);

		if (result.next()) {
			this.errorMessage.setText("login successful...");
			new ChoiceScreen().show();
		} else {
			this.errorMessage.setText("login failed !");
		}
	}

}
