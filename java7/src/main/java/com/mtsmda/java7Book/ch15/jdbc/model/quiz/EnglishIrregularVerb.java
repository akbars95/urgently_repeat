package com.mtsmda.java7Book.ch15.jdbc.model.quiz;

/**
 * Created by c-DMITMINZ on 21.01.2016.
 */
public class EnglishIrregularVerb {

    private Integer englishIrregularVerbId;
    private EnglishWord englishWord;
    private String englishIrregularVerbSimplePast;
    private String englishIrregularVerPastParticiple;

    public EnglishIrregularVerb() {

    }


    public EnglishIrregularVerb(EnglishWord englishWord, String englishIrregularVerbSimplePast, String englishIrregularVerPastParticiple) {
        this.englishWord = englishWord;
        this.englishIrregularVerbSimplePast = englishIrregularVerbSimplePast;
        this.englishIrregularVerPastParticiple = englishIrregularVerPastParticiple;
    }

    public Integer getEnglishIrregularVerbId() {
        return englishIrregularVerbId;
    }

    public void setEnglishIrregularVerbId(Integer englishIrregularVerbId) {
        this.englishIrregularVerbId = englishIrregularVerbId;
    }

    public EnglishWord getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(EnglishWord englishWord) {
        this.englishWord = englishWord;
    }

    public String getEnglishIrregularVerbSimplePast() {
        return englishIrregularVerbSimplePast;
    }

    public void setEnglishIrregularVerbSimplePast(String englishIrregularVerbSimplePast) {
        this.englishIrregularVerbSimplePast = englishIrregularVerbSimplePast;
    }

    public String getEnglishIrregularVerPastParticiple() {
        return englishIrregularVerPastParticiple;
    }

    public void setEnglishIrregularVerPastParticiple(String englishIrregularVerPastParticiple) {
        this.englishIrregularVerPastParticiple = englishIrregularVerPastParticiple;
    }
}