package com.juankevintrujillo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main extends Application {

	// private static final Logger LOGGER = LogManager.getLogger(Main.class);
	// private static final String TXT = "We've just greeted the user!";

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Weather-Prediction");
		primaryStage.setScene(new Scene(root));
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		//LOGGER.debug("Debug Message Logged !!!");
		//LOGGER.info("Info Message Logged !!!");
		//LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
	}

}
