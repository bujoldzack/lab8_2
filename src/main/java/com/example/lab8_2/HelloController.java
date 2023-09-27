package com.example.lab8_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    public Button byeButton;

    @FXML
    private Label welcomeText;

    @FXML
    private Label byeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onByeButtonClick() { byeText.setText("Bye User!");}
}