package com.mtsmda.java7Book.ch15.jdbc.model.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c-DMITMINZ on 21.01.2016.
 */
public class WordPartOfSpeech {

    private Integer wordPartOfSpeechId;
    private String wordPartOfSpeechNameEng;
    private String wordPartOfSpeechNameRus;
    private List<EnglishWord> englishWords = new ArrayList<>();

    public WordPartOfSpeech() {

    }

    public WordPartOfSpeech(String wordPartOfSpeechNameEng, String wordPartOfSpeechNameRus) {
        this.wordPartOfSpeechNameEng = wordPartOfSpeechNameEng;
        this.wordPartOfSpeechNameRus = wordPartOfSpeechNameRus;
    }

    public Integer getWordPartOfSpeechId() {
        return wordPartOfSpeechId;
    }

    public void setWordPartOfSpeechId(Integer wordPartOfSpeechId) {
        this.wordPartOfSpeechId = wordPartOfSpeechId;
    }

    public String getWordPartOfSpeechNameEng() {
        return wordPartOfSpeechNameEng;
    }

    public void setWordPartOfSpeechNameEng(String wordPartOfSpeechNameEng) {
        this.wordPartOfSpeechNameEng = wordPartOfSpeechNameEng;
    }

    public String getWordPartOfSpeechNameRus() {
        return wordPartOfSpeechNameRus;
    }

    public void setWordPartOfSpeechNameRus(String wordPartOfSpeechNameRus) {
        this.wordPartOfSpeechNameRus = wordPartOfSpeechNameRus;
    }

    public List<EnglishWord> getEnglishWords() {
        return englishWords;
    }

    public void setEnglishWords(List<EnglishWord> englishWords) {
        this.englishWords = englishWords;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof WordPartOfSpeech) {
            WordPartOfSpeech wordPartOfSpeech = (WordPartOfSpeech) obj;
            if (wordPartOfSpeech != null && wordPartOfSpeech.getWordPartOfSpeechNameEng() != null && wordPartOfSpeech.getWordPartOfSpeechNameRus() != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 9;
        if (this.getWordPartOfSpeechNameEng() != null) {
            hashCode += this.getWordPartOfSpeechNameEng().hashCode();
        }
        if (this.getWordPartOfSpeechNameRus() != null) {
            hashCode += this.getWordPartOfSpeechNameRus().hashCode();
        }
        return hashCode;
    }

    @Override
    public String toString() {
        return "WordPartOfSpeech{" +
                "wordPartOfSpeechId=" + wordPartOfSpeechId +
                ", wordPartOfSpeechNameEng='" + wordPartOfSpeechNameEng + '\'' +
                ", wordPartOfSpeechNameRus='" + wordPartOfSpeechNameRus + '\'' +
                ", englishWords=" + englishWords +
                '}';
    }
}