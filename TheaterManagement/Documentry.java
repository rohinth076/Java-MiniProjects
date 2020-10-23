package com.itech;

public class Documentry extends Movie
{
    private String topic;

    public Documentry(int movieId, String name, String language, String director, double duration,String topic) {
        super(movieId, name, language, director, duration);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Documentry{" +
                "topic='" + topic + '\'' +
                '}';
    }
}
