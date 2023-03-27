package com.example.twoviewscontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller2 {
    @FXML
    private Label sayBye;
    public Button sayByeButton;
    public Button scene1Button;

    @FXML
    public void sayByeButtonPressed() {
        sayBye.setText("Bye Advanced Computer Science!");
    }

    public void goBackToScene1(ActionEvent event) throws Exception {
        Stage stage = (Stage) scene1Button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("View1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
