package com.jakubku.gridpane.gridpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane();
        root.setGridLinesVisible(true);

        for(int row = 0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                Button b = new Button(column + "|" + row);
                root.add(b, column, row);
            }
        }
        //Column Constraints
        ColumnConstraints cc1 = new ColumnConstraints(100);
        cc1.setHalignment(HPos.LEFT);
        ColumnConstraints cc2 = new ColumnConstraints(200);
        cc2.setHalignment(HPos.CENTER);
        ColumnConstraints cc3 = new ColumnConstraints(200);
        cc3.setHalignment(HPos.RIGHT);
        //Row Constraints
        RowConstraints rc1 = new RowConstraints(50);
        rc1.setValignment(VPos.TOP);
        RowConstraints rc2 = new RowConstraints(70);
        rc2.setValignment(VPos.CENTER);
        RowConstraints rc3 = new RowConstraints(60);
        //Adding Constraints to the grid
        root.getColumnConstraints().addAll(cc1, cc2, cc3);
        root.getRowConstraints().addAll(rc1, rc2, rc3);

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
