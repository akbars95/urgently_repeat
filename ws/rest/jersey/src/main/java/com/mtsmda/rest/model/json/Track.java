package com.mtsmda.rest.model.json;

/**
 * Created by MTSMDA on 27.12.2015.
 */
public class Track {

    private String title;
    private double duration;

    public Track() {

    }

    public Track(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}