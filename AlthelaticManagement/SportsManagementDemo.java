package com.itech;

import com.itech.*;

import java.util.Date;

public class SportsManagementDemo
{
    public static void main(String[] args) throws TournamentAlreadyExistsException, InvalidTournamentException, NoSportsExistException {
        AthleteManagement athleteManagement = new AthleteManagement();
        TournamentDetails t1= new TournamentDetails(123,new Date(2020,3,5),new Date(2020,3,10));
        Sports s1 = new Chess(1,"Chess","In-Door","");
        Sports s2 = new Tennis(2,"Tennis","Out-Door","");
        Player p1 = new Player("Dhoni",25,3,"MCA");
        Player p2 = new Player("Usain",26,5,"HSC");

        s1.setPlayers(p1);
        s2.setPlayers(p2);
        s2.setPlayers(p1);
        t1.setSports(s1);
        t1.setSports(s2);
        athleteManagement.addNewTournament(t1);
        System.out.println(athleteManagement.updateTournamentStatus(123,1,"Usain"));
        System.out.println(athleteManagement.retrieveSports(123));
        System.out.println(athleteManagement.findParticipantCount(1));
        System.out.println(athleteManagement.getAllPlayerWithExperience(4));


    }


}
