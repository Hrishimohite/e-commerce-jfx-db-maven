package org.dnyanyog.addproduct;

import org.dnyanyog.common.StageFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProduct  {

	public static void main(String[] args) {
		Application.launch(args);
	}

	
	public void show( ) throws Exception {
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/AddProduct.fxml"));
		
		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.stage.setTitle("Add Product");
		StageFactory.stage.setScene(scene);

		StageFactory.stage.show();
	}

}
