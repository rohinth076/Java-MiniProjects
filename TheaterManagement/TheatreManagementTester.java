package com.itech;

import com.itech.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TheatreManagementTester {

    public static void main(String[] args)throws  Exception
    {
        TheatreManagmentSystem t = new TheatreManagmentSystem();
        List<Screen> screenList = new ArrayList<>();
        Movie m = new Feature(1234,"Hunter","Tamil","Babu",1.20,"Action");
        Movie m1 = new Documentry(134,"Killer","Tamil","Babu",1.20,"Love");
        Screen s1 = new Screen(1,"Qube-y",1000,1000,0,3,m);
        Screen s2 = new Screen(2,"Qube-x",1000,1000,4,3,m);
        Screen s3 = new Screen(3,"Trackes",1000,1000,3,3,m1);
        Screen s4 = new Screen(4,"Double-R",1000,1000,0,3,m1);
        Screen s5 = new Screen(5,"Max",1000,1000,3,3,m);
        screenList.add(s1);
        screenList.add(s2);
        screenList.add(s3);
        screenList.add(s4);
        screenList.add(s5);
        System.out.println(t.addTheatrewithScreen(121,"Natraj","TVM",5,screenList));
        System.out.println(t.listMoviesCompletedNDays());
        System.out.println(t.listMovieAvailableInTheatre(1));
        System.out.println("Is added?"+t.addMovieToTheatre(121,m));
        System.out.println("Is added?"+t.addMovieToTheatre(131,m));



    }
}
