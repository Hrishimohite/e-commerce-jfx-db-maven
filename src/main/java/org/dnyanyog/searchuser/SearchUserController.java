package org.dnyanyog.searchuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchUserController {
	String url = "jdbc:mysql://localhost:3307/ecommerce_management_scenebuilder";
	String adminName = "root";
	String password_db = "mohite@123";
	
	@FXML
	TextField searchUser;
	
	@FXML
	Label errorMessage;
	
	public void searchButtonClick() throws SQLException {
		Connection connection = DriverManager.getConnection(url, adminName, password_db);
		Statement statement = connection.createStatement();
		String searchQuery = "SELECT * FROM users WHERE username = '" + searchUser.getText() + "';";
		statement.execute(searchQuery);
		System.out.println("User found ");
        errorMessage.setText("User found Successfully");

	}
	public void backButtonClick() throws Exception {
		new UserManagement().show();
		
	}
}
