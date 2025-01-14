package org.dnyanyog;

import org.dnyanyog.common.StageFactory;
import org.dnyanyog.login.LoginScreen;

import javafx.application.Application;
import javafx.stage.Stage;

public class ECommerceMain extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception { // call back function
		StageFactory.stage = primaryStage;

		new LoginScreen().show();

	}
}
