module com.jakubku.gridpane.gridpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.gridpane.gridpane to javafx.fxml;
    exports com.jakubku.gridpane.gridpane;
}