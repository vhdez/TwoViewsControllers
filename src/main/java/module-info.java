module com.example.twoviewscontrollers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.twoviewscontrollers to javafx.fxml;
    exports com.example.twoviewscontrollers;
}