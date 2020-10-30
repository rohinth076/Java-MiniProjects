package com.itech;

import java.util.List;

public interface AthleticsManagementInterface {

    public void addNewTournament(TournamentDetails t)throws TournamentAlreadyExistsException;
    public boolean updateTournamentStatus(int tournamentId,int sportId,String winner)throws InvalidTournamentException;
    public List<Sports> retrieveSports(int tournamentId)throws NoSportsExistException;
    public int findParticipantCount(int sportId);
    public List<Player> getAllPlayerWithExperience(int experience);
}
