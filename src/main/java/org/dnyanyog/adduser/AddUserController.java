package org.dnyanyog.adduser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddUserController {
	String url = "jdbc:mysql://localhost:3307/ecommerce_management_scenebuilder";
	String adminName = "root";
	String password_db = "mohite@123";

	@FXML
	TextField userName;

	@FXML
	TextField userEmail;

	@FXML
	TextField userPhone;

	@FXML
	TextField userAddress;

	@FXML
	Label errorMessage;

	public void addUserButtonClick() throws SQLException {
		Connection connection = DriverManager.getConnection(url, adminName, password_db);
		Statement statement = connection.createStatement();
		String userAddQuery = ("INSERT INTO users(userName,userEmail,userPhone,userAddress) VALUES ('"
				+ userName.getText() + "', '" + userEmail.getText() + "', '" + userPhone.getText() + "','"
				+ userAddress.getText() + "');");
		statement.execute(userAddQuery);
		System.out.println("User Added Successfully");
		errorMessage.setTextFill(Color.GREEN);
		errorMessage.setText("User Added Successfully");

	}

	public void backButtonClick() throws Exception {
		new UserManagement().show();
	}

}
