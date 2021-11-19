package com.example.dictionary.models;

public class EnglishWord {

    private String word, phoneticsText;
    private  Meaning[] meanings;
    private String phonetic;
    private String origin;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPhoneticsText() {
        return phoneticsText;
    }

    public void setPhoneticsText(String phoneticsText) {
        this.phoneticsText = phoneticsText;
    }

    public Meaning[] getMeanings() {
        return meanings;
    }

    public void setMeanings(Meaning[] meanings) {
        this.meanings = meanings;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
