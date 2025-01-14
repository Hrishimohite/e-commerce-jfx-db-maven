package org.dnyanyog.updateproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.productmanagment.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateProductController {
	String url = "jdbc:mysql://localhost:3307/ecommerce_management_scenebuilder";
	String adminName = "root";
	String password_db = "mohite@123";
	
	@FXML
	TextField productName;

	@FXML
	TextField productPrice;

	@FXML
	TextField productQuantity;

	@FXML
	Label errorMessage;
	
	public void updateButtonClick() throws SQLException {
		Connection connection = DriverManager.getConnection(url, adminName, password_db);
		Statement statement = connection.createStatement();
		String productUpdateQuery = ("INSERT INTO product(productName,productPrice,productQuantity) VALUES ('"
				+ productName.getText() + "', '" + productPrice.getText() + "', '" + productQuantity.getText() + "');");
		statement.execute(productUpdateQuery);
		System.out.println("product updated Successfully");
        errorMessage.setText("product updated Successfully");

	}
	public void backButtonClick() throws Exception {
		new ProductManagement().show();
		
	}

}
