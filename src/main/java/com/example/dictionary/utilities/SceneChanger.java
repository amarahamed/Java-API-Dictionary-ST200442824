package com.example.dictionary.utilities;

import com.example.dictionary.Main;
import com.example.dictionary.controller.WordMoreDetailsViewController;
import com.example.dictionary.models.Word;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {
    public static void changeScene(ActionEvent event, String title, String fxmlPath, Word selectedWord) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlPath));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        WordMoreDetailsViewController controller = fxmlLoader.getController();
        controller.getSelectedWord(selectedWord);

        stage.setScene(scene);
        stage.setTitle(title);
    }

    public static void changeScene(ActionEvent event, String title, String fxmlPath) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlPath));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle(title);
    }
}
