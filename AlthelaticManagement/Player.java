package com.itech;

public class Player {
    private  String name;
    private int age;
    private int experience;
    private String qualification;

    public Player(String name, int age, int experience, String qualification) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
