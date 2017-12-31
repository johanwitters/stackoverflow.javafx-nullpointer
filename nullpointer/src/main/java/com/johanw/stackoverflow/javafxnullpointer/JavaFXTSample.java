package com.johanw.stackoverflow.javafxnullpointer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXTSample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane iAmRoot = new StackPane();

        Scene scene = new Scene(iAmRoot, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main (String[] args) {
        launch(args);
    }
}