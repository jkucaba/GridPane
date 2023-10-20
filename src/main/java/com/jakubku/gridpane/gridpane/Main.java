package com.jakubku.gridpane.gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane();
        //root.setGridLinesVisible(true);
        root.setHgap(10);
        root.setVgap(10);

        Label label = new Label("First Name");
        TextField field = new TextField();
        Button button = new Button("COMMENT");
        TextArea area = new TextArea();
        area.setPromptText("Enter Your Message Here");

        root.addRow(0, label, field, button);
        root.add(area, 0, 1, GridPane.REMAINING, 1);

        root.setStyle("-fx-padding: 10;"+"-fx-border-style: solid inside;"+"-fx-border-width: 2;"+"-fx-border-insets: 5;"+ "-fx-border-radius: 5;"+"-fx-border-color: blue;");
        Scene scene = new Scene(root);
        root.requestFocus(); //nothing highlighted
        stage.setTitle("GridPane Layout Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
