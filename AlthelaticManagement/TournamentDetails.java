package com.itech;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TournamentDetails {

    private int tournamentId;
    private Date tournamentStartDate;
    private Date tournamentEndDate;
    private List<Sports> sports;

    public TournamentDetails(int tournamentId, Date tournamentStartDate, Date tournamentEndDate) {
        this.tournamentId = tournamentId;
        this.tournamentStartDate = tournamentStartDate;
        this.tournamentEndDate = tournamentEndDate;
        sports = new ArrayList<>();
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Date getTournamentStartDate() {
        return tournamentStartDate;
    }

    public void setTournamentStartDate(Date tournamentStartDate) {
        this.tournamentStartDate = tournamentStartDate;
    }

    public Date getTournamentEndDate() {
        return tournamentEndDate;
    }

    public void setTournamentEndDate(Date tournamentEndDate) {
        this.tournamentEndDate = tournamentEndDate;
    }

    public List<Sports> getSports() {
        return sports;
    }

    public void setSports(Sports sport) {
        sports.add(sport);
    }

    @Override
    public String toString() {
        return "TournamentDetails{" +
                "tournamentId=" + tournamentId +
                ", tournamentStartDate=" + tournamentStartDate +
                ", tournamentEndDate=" + tournamentEndDate +
                ", sports=" + sports +
                '}';
    }
}
