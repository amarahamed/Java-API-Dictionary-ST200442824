package com.example.dictionary.controller;

import com.example.dictionary.models.Definition;
import com.example.dictionary.models.Meaning;
import com.example.dictionary.models.Word;
import com.example.dictionary.utilities.APIUtility;
import com.example.dictionary.utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DictionaryViewController implements Initializable {

    @FXML
    private TextField searchInput;

    @FXML
    private TableView<Word> tableView;

    @FXML
    private TableColumn<Word, String> wordColumn;

    @FXML
    private TableColumn<Word, String> phoneticColumn;

    @FXML
    private TableColumn<Word, String> originColumn;

    @FXML
    private Label errorLabel;

    // btn click event - clear All
    @FXML
    private void clearAll(ActionEvent event) {
        tableView.getItems().clear();
        searchInput.clear();
        errorLabel.setText(" ");
    }

    private void clearAll() {
        tableView.getItems().clear();
        errorLabel.setText(" ");
    }

    @FXML
    private void getMoreDetails(ActionEvent event) throws IOException {
        Word selectedWord = tableView.getSelectionModel().getSelectedItem();
        if(selectedWord == null) {
            errorLabel.setText("Please select a word from the list");
        } else {
            SceneChanger.changeScene(event, "More Details for " + selectedWord.getWord(), "word-more-details-view.fxml", selectedWord);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errorLabel.setText(" ");
        wordColumn.setCellValueFactory(new PropertyValueFactory<>("word"));
        phoneticColumn.setCellValueFactory(new PropertyValueFactory<>("phonetic"));
        originColumn.setCellValueFactory(new PropertyValueFactory<>("origin"));

    }

    @FXML
    void searchWord(ActionEvent event) throws IOException, InterruptedException {
        clearAll();
        if(searchInput.getText().isEmpty()) {
            errorLabel.setText("Please enter a word");
        } else {
            Word[] fetched = APIUtility.getMeaningFromAPI(searchInput.getText());
            if(fetched != null) {
                tableView.getItems().addAll(fetched);
            } else {
                errorLabel.setText("No results found for " + searchInput.getText());
            }
        }
    }
}
