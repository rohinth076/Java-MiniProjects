package com.itech;

public class StudentDoesntExist extends Exception {
    String s;
    public StudentDoesntExist()
    {
        super();
    }
    public StudentDoesntExist(String s)
    {
        super(s);
        this.s  =  s;
    }
    public String toString()
    {
        return s;
    }
}
