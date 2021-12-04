package com.example.dictionary.models;

public class Word {
    private String word, phonetic,origin;
    private Meaning[] meanings;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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

    public Meaning[] getMeanings() {
        return meanings;
    }

    public void setMeanings(Meaning[] meanings) {
        this.meanings = meanings;
    }
}
