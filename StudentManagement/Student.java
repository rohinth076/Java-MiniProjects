package com.itech;

import java.util.List;

public class Student {
    private long rollNo;
    private String name;
    private String address;
    private String subject;
    private List<Integer>marks;
    public Student(){}
    public Student(long rollNo,String name,String address,String subject,List<Integer> marks)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.subject = subject;
        this.marks = marks;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
    public  String toString()
    {
        return name+"\t"+rollNo+"\t"+address+"\t"+subject+"\t"+marks;
    }
}
