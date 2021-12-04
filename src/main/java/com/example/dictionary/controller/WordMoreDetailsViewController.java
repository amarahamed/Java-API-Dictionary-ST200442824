package com.example.dictionary.controller;

import com.example.dictionary.models.Definition;
import com.example.dictionary.models.Word;
import com.example.dictionary.utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WordMoreDetailsViewController implements Initializable {

    @FXML
    private Label titleLabel;

    @FXML
    private TextField phoneticField;

    @FXML
    private TextField wordField;

    @FXML
    private TextField originField;

    @FXML
    private TextField partOfSpeechField;

    @FXML
    private ListView<String> synonymsListView;

    @FXML
    private ListView<String> antonymsListView;

    @FXML
    private ListView<Definition> definitionsListView;

    public void getSelectedWord(Word word) {

        titleLabel.setText("More Details For " + word.getWord());

        phoneticField.setText(word.getPhonetic());

        wordField.setText(word.getWord());

        originField.setText(word.getOrigin());

        partOfSpeechField.setText(word.getMeanings()[0].getPartOfSpeech());

        definitionsListView.getItems().addAll(word.getMeanings()[0].getDefinitions());

        for (int i = 0; i < word.getMeanings()[0].getDefinitions().length; i++) {
            synonymsListView.getItems().addAll(word.getMeanings()[0].getDefinitions()[i].getSynonyms());
            antonymsListView.getItems().addAll(word.getMeanings()[0].getDefinitions()[i].getAntonyms());
        }

        if(antonymsListView.getItems().size() == 0) {
            antonymsListView.getItems().add("NO ANTONYMS FOUND FOR WORD : " + word.getWord());
        }

        if(synonymsListView.getItems().size() == 0) {
            synonymsListView.getItems().add("NO SYNONYMS FOUND FOR WORD : " + word.getWord());
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        phoneticField.setEditable(false);
        wordField.setEditable(false);
        originField.setEditable(false);
        partOfSpeechField.setEditable(false);
    }

    @FXML
    void backToSearchView(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "Dictionary - Search any english word!", "dictionary-view.fxml");
    }

}
