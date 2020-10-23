package com.itech;

import java.util.Date;

public class Screen {
    private int screenId;
    private String name;
    private int width;
    private int height;
    private int noOfDaysRunning;
    private int noOfShows;
    private Movie movie;

    public Screen(int screenId, String name, int width, int height, int noOfDaysRunning, int noOfShows, Movie movie) {
        this.screenId = screenId;
        this.name = name;
        this.width = width;
        this.height = height;
        this.noOfDaysRunning = noOfDaysRunning;
        this.noOfShows = noOfShows;
        this.movie = movie;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNoOfDaysRunning() {
        return noOfDaysRunning;
    }

    public void setNoOfDaysRunning(int noOfDaysRunning) {
        this.noOfDaysRunning = noOfDaysRunning;
    }

    public int getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(int noOfShows) {
        this.noOfShows = noOfShows;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screenId=" + screenId +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", noOfDaysRunning=" + noOfDaysRunning +
                ", noOfShows=" + noOfShows +
                ", movie=" + movie +
                '}';
    }
}
