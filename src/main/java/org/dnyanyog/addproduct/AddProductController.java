package org.dnyanyog.addproduct;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.productmanagment.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddProductController {
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

	public void addProductButtonClick() throws SQLException, IOException {
		Connection connection = DriverManager.getConnection(url, adminName, password_db);
		Statement statement = connection.createStatement();

		String productAddQuery = ("INSERT INTO product(productName,productPrice,productQuantity) VALUES ('"
				+ productName.getText() + "', '" + productPrice.getText() + "', '" + productQuantity.getText() + "');");
		statement.execute(productAddQuery);
		System.out.println("product Added Successfully");
		errorMessage.setTextFill(Color.GREEN);
        errorMessage.setText("Product Added Successfully");
	}
	public void backButtonClick() throws Exception {
		new ProductManagement().show();
		
	}


}
