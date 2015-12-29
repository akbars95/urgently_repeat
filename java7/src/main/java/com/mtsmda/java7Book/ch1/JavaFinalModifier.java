package com.mtsmda.java7Book.ch1;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class JavaFinalModifier {

    public static void main(String[] args) {
main(19, new Club("Barcelona", 1));
    }

    public static void main(final Integer integer, final Club club){
        System.out.println(integer);
//        integer = new Integer(15);
        System.out.println(integer);
        System.out.println(club);
//        club = new Club("Real Madrid", 2);
        club.setName("Real Madrid");
        club.setPlaceInChampionats(2);
        System.out.println(club);
    }

}

class FinalEx{
    public final String name;

    {
    name = "Init";
    }

    /*public FinalEx(){
        name = "COnst";
    }

    public void setName(String name){
        this.name = name;
    }*/

}


class Club{
    private String name;
    private int placeInChampionats;

    public Club(String name, int placeInChampionats) {
        this.name = name;
        this.placeInChampionats = placeInChampionats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlaceInChampionats() {
        return placeInChampionats;
    }

    public void setPlaceInChampionats(int placeInChampionats) {
        this.placeInChampionats = placeInChampionats;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", placeInChampionats=" + placeInChampionats +
                '}';
    }



}