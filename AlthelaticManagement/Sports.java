package com.itech;

import java.util.ArrayList;
import java.util.List;

public class Sports
{
    private int sportId;
    private String sportName;
    private String gameType;
    private String winner;
    private List<Player> players;

    public Sports(int sportId,String sportName, String gameType, String winner) {
        this.sportId = sportId;
        this.sportName = sportName;
        this.gameType = gameType;
        this.winner = winner;
        players = new ArrayList<>();
    }

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Player player) {
        players.add(player);
    }

    @Override
    public String toString() {
        return "Sports{" +
                "sportId=" + sportId +
                ", sportName='" + sportName + '\'' +
                ", gameType='" + gameType + '\'' +
                ", winner='" + winner + '\'' +
                ", players=" + players +
                '}';
    }
}
