package com.itech;

public class Feature extends Movie{
    private String type;
    public Feature(int movieId, String name, String language, String director, double duration,String type) {
        super(movieId, name, language, director, duration);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "type='" + type + '\'' +
                '}';
    }
}
