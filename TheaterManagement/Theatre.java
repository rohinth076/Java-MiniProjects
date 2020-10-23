package com.itech;

import java.util.List;

public class Theatre {
    private int theatreId;
    private String name;
    private String address;
    private int noOfScreen;
    List<Screen> screens;

    public Theatre(int theatreId, String name, String address, int noOfScreen, List<Screen> screens) {
        this.theatreId = theatreId;
        this.name = name;
        this.address = address;
        this.noOfScreen = noOfScreen;
        this.screens = screens;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfScreen() {
        return noOfScreen;
    }

    public void setNoOfScreen(int noOfScreen) {
        this.noOfScreen = noOfScreen;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
    public void addScreen(Screen s)
    {
        screens.add(s);
    }
    @Override
    public String toString() {
        return "Theater{" +
                "theatreId=" + theatreId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", noOfScreen=" + noOfScreen +
                ", screens=" + screens +
                '}';
    }
}
