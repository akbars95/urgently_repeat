package com.mtsmda.java7Book.ch15.jdbc.model.quiz;

/**
 * Created by c-DMITMINZ on 21.01.2016.
 */
public class Translate {

    private RussianWord russianWord;
    private EnglishWord englishWord;

    public Translate() {

    }

    public Translate(RussianWord russianWord, EnglishWord englishWord) {
        this.russianWord = russianWord;
        this.englishWord = englishWord;
    }

    public RussianWord getRussianWord() {
        return russianWord;
    }

    public void setRussianWord(RussianWord russianWord) {
        this.russianWord = russianWord;
    }

    public EnglishWord getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(EnglishWord englishWord) {
        this.englishWord = englishWord;
    }
}