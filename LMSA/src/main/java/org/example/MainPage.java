package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainPage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
            //New comments
            Button button = new Button();
            BorderPane borderPane = new BorderPane();
            Scene scene = new Scene(borderPane,400,450);
            primaryStage.setTitle("Library Management System");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
}
