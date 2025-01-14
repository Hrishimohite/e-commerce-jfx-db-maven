package org.dnyanyog.updateuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.usermanagement.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateUserController {
	String url = "jdbc:mysql://localhost:3307/ecommerce_management_scenebuilder";
	String adminName = "root";
	String password_db = "mohite@123";
	
	@FXML
	TextField userName;
	
	@FXML
	TextField newUserName;
	
	@FXML
	TextField newUserEmail;
	
	@FXML
	TextField newUserPhone;
	
	@FXML
	TextField newUserAddress;
	@FXML
	Label errorMessage;
	
	public void updateButtonClick() throws SQLException {
		Connection connection = DriverManager.getConnection(url, adminName, password_db);
		Statement statement = connection.createStatement();
		String userUpdateQuery = ("INSERT INTO users(userName,userEmail,userPhone,userAddress) VALUES ('"
				+ newUserName.getText() + "', '" + newUserEmail.getText() + "', '" + newUserPhone.getText() + "','"
				+ newUserAddress.getText() + "');");
		statement.execute(userUpdateQuery);
		System.out.println("User updated Successfully");
        errorMessage.setText("User updated Successfully");

	}
	public void backButtonClick() throws Exception {
		new UserManagement().show();
		
	}

}
