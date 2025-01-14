package org.dnyanyog.deleteuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteUserController {
	String url = "jdbc:mysql://localhost:3307/ecommerce_management_scenebuilder";
	String adminName = "root";
	String password_db = "mohite@123";

	@FXML
	TextField deleteUser;

	@FXML
	Label errorMessage;

	public void deleteButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url, adminName, password_db);
		Statement statement = connection.createStatement();

		String executeQuery = ("DELETE FROM users WHERE userName = '" + deleteUser.getText() + "';");
		statement.execute(executeQuery);
		System.out.println("User Deleted Successfully");
		 errorMessage.setText("User Deleted Successfully");

	}

	public void backButtonClick() throws Exception {
		new UserManagement().show();

	}

}
