package org.dnyanyog.searchuser;

import java.io.IOException;

import org.dnyanyog.common.StageFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchUser {	
	public static void main(String[] args) {
	Application.launch(args);
}

public void show() throws IOException {

	Parent actorGroup = FXMLLoader.load(getClass().getResource("/SearchUser.fxml"));

	Scene scene = new Scene(actorGroup, 600, 400);
	StageFactory.stage.setTitle("Search User");
	StageFactory.stage.setScene(scene);

	StageFactory.stage.show();
}

}
