package org.example.htmlreader;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HtmlEditorController  {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}