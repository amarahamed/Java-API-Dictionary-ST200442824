module com.example.dictionary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dictionary to javafx.fxml;
    exports com.example.dictionary;
    exports com.example.dictionary.Controller;
    opens com.example.dictionary.Controller to javafx.fxml;
    exports com.example.dictionary.controller;
    opens com.example.dictionary.controller to javafx.fxml;
}