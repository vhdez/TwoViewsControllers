package com.example.twoviewscontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller1 {
    @FXML
    private Label sayHi;
    public Button sayHiButton;
    public Button scene2Button;

    @FXML
    public void sayHiButtonPressed() {
        sayHi.setText("Hi Advanced Computer Science!");
    }

    public void goToScene2(ActionEvent event) throws Exception {
        Stage stage = (Stage) scene2Button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("View2.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}