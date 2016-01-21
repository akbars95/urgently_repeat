package com.mtsmda.java7Book.ch15.jdbc.model.quiz;

/**
 * Created by c-DMITMINZ on 21.01.2016.
 */
public class EnglishWord {

    private Integer englishWordId;
    private String englishWord;
    private WordPartOfSpeech wordPartOfSpeech;

    public EnglishWord() {

    }

    public EnglishWord(String englishWord, WordPartOfSpeech wordPartOfSpeech) {
        this.englishWord = englishWord;
        this.wordPartOfSpeech = wordPartOfSpeech;
    }

    public Integer getEnglishWordId() {
        return englishWordId;
    }

    public void setEnglishWordId(Integer englishWordId) {
        this.englishWordId = englishWordId;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public WordPartOfSpeech getWordPartOfSpeech() {
        return wordPartOfSpeech;
    }

    public void setWordPartOfSpeech(WordPartOfSpeech wordPartOfSpeech) {
        this.wordPartOfSpeech = wordPartOfSpeech;
    }
}