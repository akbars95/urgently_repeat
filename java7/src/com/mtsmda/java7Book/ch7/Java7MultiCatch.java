package com.mtsmda.java7Book.ch7;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * Created by c-DMITMINZ on 09.12.2015.
 */
public class Java7MultiCatch {

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println(e.getClass().getCanonicalName());
        }
        catch (Exception e){
            System.out.println(e.getClass().getCanonicalName());
        }
    }

}