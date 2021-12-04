module com.example.dictionary {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;
    requires java.net.http;

    opens com.example.dictionary to javafx.fxml;
    exports com.example.dictionary;
    exports com.example.dictionary.controller;
    opens com.example.dictionary.controller to javafx.fxml;
    exports com.example.dictionary.utilities;
    opens com.example.dictionary.utilities to javafx.fxml, com.google.gson;
    exports com.example.dictionary.models;
    opens com.example.dictionary.models to javafx.fxml, com.google.gson;
}