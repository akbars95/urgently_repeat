package com.mtsmda.java7Book.ch15.jdbc;

import com.mtsmda.java7Book.ch15.jdbc.model.quiz.WordPartOfSpeech;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 13.01.2016.
 */
public class ExJDBC {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getConnection(DBConnection.DB.MYSQL);
        System.out.println(connection != null);
        if (connection != null) {
            Statement statement = connection.createStatement();
            System.out.println(statement.getClass().getCanonicalName());
        }
        System.out.println(connection.isClosed());

        System.out.println("-*-------------*--------------------*---------*--------*-------------");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from word_part_of_speech");
        List<WordPartOfSpeech> wordPartOfSpeeches = new ArrayList<>();
        while (resultSet.next()) {
            WordPartOfSpeech wordPartOfSpeech = new WordPartOfSpeech(resultSet.getString("word_part_of_speech_name_eng"), resultSet.getString("word_part_of_speech_name_rus"));
            wordPartOfSpeech.setWordPartOfSpeechId(resultSet.getInt("word_part_of_speech_id"));
            wordPartOfSpeeches.add(wordPartOfSpeech);
        }

        WordPartOfSpeech wordPartOfSpeechVerb = null;

        ResultSetMetaData metaData = resultSet.getMetaData();
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            System.out.print("\t\t\t" + metaData.getColumnName(i));
        }
        System.out.println();

        for (WordPartOfSpeech wordPartOfSpeech : wordPartOfSpeeches) {
            System.out.println("\t\t\t\t\t" + wordPartOfSpeech.getWordPartOfSpeechId() + "\t\t\t\t\t\t\t" + wordPartOfSpeech.getWordPartOfSpeechNameEng() + "\t\t\t\t\t\t\t" + wordPartOfSpeech.getWordPartOfSpeechNameRus());
            if (wordPartOfSpeech.getWordPartOfSpeechNameEng().contains("Verb")) {
                wordPartOfSpeechVerb = wordPartOfSpeech;
            }
        }

        connection.setAutoCommit(false);
        System.out.println(statement.executeUpdate("delete from english_word where english_word = 'awake'"));

        int i = statement.executeUpdate("Insert into english_word (english_word, word_part_of_speech_id) values('awake', " + wordPartOfSpeechVerb.getWordPartOfSpeechId() + ");");
        System.out.println("result = " + i);

        connection.commit();

        resultSet.close();
        statement.close();
        connection.close();
    }

}