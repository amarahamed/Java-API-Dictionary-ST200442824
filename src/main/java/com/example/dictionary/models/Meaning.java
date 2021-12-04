package com.example.dictionary.models;

public class Meaning {
    private String partOfSpeech;
    private Definition[] definitions;

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public Definition[] getDefinitions() {
        return definitions;
    }

    public void setDefinitions(Definition[] definitions) {
        this.definitions = definitions;
    }

    @Override
    public String toString() {
        return String.format("Part of speech: %s", partOfSpeech);
    }
}
