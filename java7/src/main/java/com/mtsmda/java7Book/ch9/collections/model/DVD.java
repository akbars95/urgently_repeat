package com.mtsmda.java7Book.ch9.collections.model;

/**
 * Created by c-DMITMINZ on 29.12.2015.
 */
public class DVD implements Comparable<DVD>{

    private String title;
    private String genre;
    private String leadActor;

    public DVD() {

    }

    public DVD(String title, String genre, String leadActor) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", leadActor='" + leadActor + '\'' +
                '}';
    }

    @Override
    public int compareTo(DVD o) {
        System.out.println("compareTO = " + title.compareTo(o.title) + "\t" + this + "_____ Other = " + o);
        return title.compareTo(o.title);
    }
}