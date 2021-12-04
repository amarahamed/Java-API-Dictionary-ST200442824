package com.example.dictionary.models;

public class Definition {
    private String definition, example;
    private String[] synonyms, antonyms;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String[] getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String[] synonyms) {
        this.synonyms = synonyms;
    }

    public String[] getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(String[] antonyms) {
        this.antonyms = antonyms;
    }

    @Override
    public String toString() {
        if(example == null) {
            example = "No examples found";
        }
        return String.format("Definition: %s, Example: %s", this.definition, this.example);
    }
}
