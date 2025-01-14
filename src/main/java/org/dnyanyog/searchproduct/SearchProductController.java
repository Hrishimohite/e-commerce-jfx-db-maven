package org.dnyanyog.searchproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.dnyanyog.productmanagment.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchProductController {

	String url = "jdbc:mysql://localhost:3307/ecommerce_management_scenebuilder";
	String adminName = "root";
	String password_db = "mohite@123";
	
	@FXML
	TextField searchProduct;
	
	@FXML
	Label errorMessage;
	
	public void searchButtonClick() throws SQLException {
		Connection connection = DriverManager.getConnection(url, adminName, password_db);
		Statement statement = connection.createStatement();
		String searchQuery = "SELECT * FROM product WHERE productName = '" + searchProduct.getText() + "';";
		statement.execute(searchQuery);
		System.out.println("product found ");
        errorMessage.setText("product found Successfully");

	}
	public void backButtonClick() throws Exception {
		new ProductManagement().show();
		
	}
}
