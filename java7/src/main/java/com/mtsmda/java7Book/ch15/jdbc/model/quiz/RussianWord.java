package com.mtsmda.java7Book.ch15.jdbc.model.quiz;

/**
 * Created by c-DMITMINZ on 21.01.2016.
 */
public class RussianWord {

    private Integer russianWordId;
    private String russianWord;
    private WordPartOfSpeech wordPartOfSpeech;

    public RussianWord() {

    }

    public RussianWord(String russianWord, WordPartOfSpeech wordPartOfSpeech) {
        this.russianWord = russianWord;
        this.wordPartOfSpeech = wordPartOfSpeech;
    }

    public Integer getRussianWordId() {
        return russianWordId;
    }

    public void setRussianWordId(Integer russianWordId) {
        this.russianWordId = russianWordId;
    }

    public String getRussianWord() {
        return russianWord;
    }

    public void setRussianWord(String russianWord) {
        this.russianWord = russianWord;
    }

    public WordPartOfSpeech getWordPartOfSpeech() {
        return wordPartOfSpeech;
    }

    public void setWordPartOfSpeech(WordPartOfSpeech wordPartOfSpeech) {
        this.wordPartOfSpeech = wordPartOfSpeech;
    }
}