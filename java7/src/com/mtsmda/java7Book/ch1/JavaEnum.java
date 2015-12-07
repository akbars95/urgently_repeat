package com.mtsmda.java7Book.ch1;

/**
 * Created by MTSMDA on 03.12.2015.
 */
public class JavaEnum {

    public static void main(String[] args) {
        System.out.println(FootballClub.BARCELONA);
        System.out.println(FootballClub.CHELSEA.name());
        System.out.println(FootballClub.SPARTAK.getCode());
        System.out.println(FootballClub.BARCELONA.getCode());
    }

}

enum FootballClub{

    BARCELONA, MILAN, CHELSEA("chelsea"), SPARTAK{
        @Override
        public String getCode() {
            return "C";
        }
    }, BAYERN;

    private String name;

    FootballClub() {

    }

    FootballClub(String name) {
        this.name = name;
    }

    public String getCode(){
        return "A";
    }
}