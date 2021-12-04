package com.example.dictionary.models;

public class SearchedWord {

    private String phonetic, word, origin, partOfSpeech, definition, example;
    private String[] synonyms, antonyms;

    public SearchedWord(String phonetic, String word, String origin, String partOfSpeech, String definition, String example, String[] synonyms, String[] antonyms) {
        setPhonetic(phonetic);
        setWord(word);
        setOrigin(origin);
        setPartOfSpeech(partOfSpeech);
        setDefinition(definition);
        setExample(example);
        setSynonyms(synonyms);
        setAntonyms(antonyms);
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

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
}
