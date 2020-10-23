package com.itech;

public class Movie {
    private int movieId;
    private String name;
    private String language;
    private String director;
    private  double duration;

    public Movie(int movieId, String name, String language, String director, double duration) {
        this.movieId = movieId;
        this.name = name;
        this.language = language;
        this.director = director;
        this.duration = duration;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                '}';
    }
}
