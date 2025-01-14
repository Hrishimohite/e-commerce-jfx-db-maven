package org.dnyanyog;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class JavaFxHelloWorld extends Application {
	public static void main(String[] args) {
		Application.launch();       // static method launch is called
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Stage stage =new Stage();  //create stage
		
		stage.setTitle("First window");   //Arrange the stage 
		stage.setFullScreen(true);
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		Group actorGroup =new Group(); //create a actorGroup which will perform on stage
		Scene scene =new Scene(actorGroup, Color.BLUE);
		stage.setScene(scene);
		stage.show();
		
	}

}
