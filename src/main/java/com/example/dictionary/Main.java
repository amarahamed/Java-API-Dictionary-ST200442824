package com.example.dictionary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("dictionary-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Dictionary - Search any english word!");
        stage.setScene(scene);
        stage.getIcons().add(new Image(String.valueOf(Main.class.getResource("favicon.png"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}