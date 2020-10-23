package com.itech;

import java.util.*;

public class TheatreManagmentSystem
{
    private List<Theatre> theatres;

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    public TheatreManagmentSystem(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    public TheatreManagmentSystem() {
        theatres = new ArrayList<>();
    }

   public boolean addTheatrewithScreen(int theatreId,String name,String address,int noOfScreen,List<Screen>screenList)
    {
        if(noOfScreen!=screenList.size())
            return false;
        theatres.add(new Theatre(theatreId,name,address,noOfScreen,screenList));
        return true;
    }
   public boolean addMovieToTheatre(int theatreId,Movie m)throws ScreenNotAvailable
   {
       Theatre t = theatres.stream().filter(i->i.getTheatreId()==theatreId).findFirst().get();
       System.out.println(t);
       if(t==null)return false;
       Screen s = t.getScreens().stream().filter(i->i.getNoOfDaysRunning()==0).findFirst().get();
       if(s==null)throw new ScreenNotAvailable("There is no screen available to release the movie");
       s.setMovie(m);
       return true;
   }
    public boolean dropMovieFromTheatre(int theatreId,Movie m)throws MovieNotExist
    {
        Theatre t = theatres.stream().filter(i->i.getTheatreId()==theatreId).findAny().get();

        if(t==null)return false;
        Screen screen = t.getScreens().stream().filter(i->i.getMovie().equals(m)).findFirst().get();
        if(screen==null)throw new MovieNotExist("Unable to locate the movie with specified name");
        screen.setMovie(null);
        return true;
    }
    public Map<String ,Integer> listMoviesCompletedNDays()
    {
        Map<String,Integer> m = new HashMap<>();
        int c;
        for(Theatre t:theatres) {
            c=0;
            for (Screen s : t.getScreens())
                if (s.getMovie() instanceof Feature)
                    c++;
           m.put(t.getName(),c);

        }
        return m;
    }
    public List<Movie> listMovieAvailableInTheatre(int numberOfDays)
    {
        List<Movie> lm = new ArrayList<>();
        for(Theatre t:theatres)
          for(Screen s:  t.getScreens())
              if(s.getNoOfDaysRunning()>=numberOfDays)
              lm.add(s.getMovie());
        Collections.sort(lm,(x,y)->x.getName().compareTo(y.getName()));
        return lm;
    }
    @Override
    public String toString() {
        return "TheatreManagmentSystem{" +
                "theatres=" + theatres +
                '}';
    }
}
