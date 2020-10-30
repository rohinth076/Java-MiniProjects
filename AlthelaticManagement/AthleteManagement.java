package com.itech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class AthleteManagement implements AthleticsManagementInterface {
    List<TournamentDetails> tournamentDetails;
    DateValidator dateValidator;

    public AthleteManagement() {
        tournamentDetails = new ArrayList<>();
        dateValidator = new DateValidator();
    }

    @Override

    public void addNewTournament(TournamentDetails t) throws TournamentAlreadyExistsException
    {
        long c = tournamentDetails.stream().filter(i->i.equals(t)).count();
        if(c!=0)throw new TournamentAlreadyExistsException();
        tournamentDetails.add(t);
    }

    @Override
    public boolean updateTournamentStatus(int tournamentId, int sportId, String winner) throws InvalidTournamentException{

        List<Sports> s = new ArrayList<>();
                try {
                    s = tournamentDetails.stream().
                            filter(i -> i.getTournamentId() == tournamentId).
                            map(TournamentDetails::getSports).findFirst().get();
                }catch (Exception e)
                {
                    throw new InvalidTournamentException();
                }
            List<Sports> x = s.stream().filter(i->i.getSportId()==sportId).collect(toList());
                if(x.isEmpty())return false;
            x.get(0).setWinner(winner);
        return true;
    }

    @Override
    public List<Sports> retrieveSports(int tournamentId) throws NoSportsExistException {
        List<Sports> sportsList = new ArrayList<>();
        try {
           sportsList = tournamentDetails.stream().map(TournamentDetails::getSports).findAny().get();
        }catch (Exception e)
        {
            throw new NoSportsExistException();
        }
        return sportsList;
    }

    @Override
    public int findParticipantCount(int sportId)
    {
        int count =0;
        for(TournamentDetails t:tournamentDetails)
        {
         List<Sports> sportsList =   t.getSports();
         count += (sportsList.stream().filter(i->i.getSportId()==sportId).map(Sports::getPlayers).collect(toList())).size();
        }
        return count;
    }

    @Override
    public List<Player> getAllPlayerWithExperience(int experience)
    {
        List<Player> playerList = new ArrayList<>();
        for(TournamentDetails t:tournamentDetails)
          for(Sports s: t.getSports())
              for(Player p:s.getPlayers())
                  if(p.getExperience()>=experience)
                      playerList.add(p);
        return playerList;
    }
}
