package org.dnyanyog.deleteproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.dnyanyog.productmanagment.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteProductController {
	String url = "jdbc:mysql://localhost:3307/ecommerce_management_scenebuilder";
	String adminName = "root";
	String password_db = "mohite@123";

	@FXML
	TextField deleteProduct;

	@FXML
	Label errorMessage;

	public void deleteButtonClick() throws Exception {
		Connection connection = DriverManager.getConnection(url, adminName, password_db);
		Statement statement = connection.createStatement();

		String executeQuery = ("DELETE FROM product WHERE productName = '" + deleteProduct.getText() + "';");
		statement.execute(executeQuery);
		System.out.println("Product Deleted Successfully");
		 errorMessage.setText("Product Deleted Successfully");

	}

	public void backButtonClick() throws Exception {
		new ProductManagement().show();

	}
}
