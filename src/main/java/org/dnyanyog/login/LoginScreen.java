package org.dnyanyog.login;

import java.io.IOException;

import org.dnyanyog.common.StageFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginScreen  {
	
	
	public void show() throws IOException{
		StageFactory.stage.setTitle("Customer Login");
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/LoginScreen.fxml"));
		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.stage.setScene(scene);
		StageFactory.stage.show();
		
	}
}