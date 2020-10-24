package com.itech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentManagementSystem implements StudentMgmtInterface
{

    private List<Student> ls;
    public StudentManagementSystem()
    {
        ls = new ArrayList<>();
    }
    @Override
    public boolean addStudent(Student s)
    {
        if(ls.size()>=10)
        return false;
        ls.add(s);
        return true;
    }

    @Override
    public boolean deleteStudent(long rollNo) throws StudentDoesntExist
    {
        List<Student> s = ls.stream().filter(i->i.getRollNo()==rollNo).limit(1).collect(Collectors.toList());
        if(s.isEmpty())
            throw  new StudentDoesntExist("Student information not exist!");
        ls.remove(s.get(0));
        return true;
    }

    @Override
    public void listStudent()
    {
        for(Student s:ls)
            System.out.println(s);
    }

    @Override
    public boolean updateStudent(long rollNo, Student std) throws StudentDoesntExist
    {
        List<Student> s = ls.stream().filter(i->i.getRollNo()==rollNo).limit(1).collect(Collectors.toList());
        if(s.isEmpty())
            throw  new StudentDoesntExist("Student information not exist!");
        Collections.replaceAll(ls,s.get(0),std);
        return true;
    }

    @Override
    public Student findTopper()
    {
        Student ans = ls.get(0);
        int big = ls.get(0).getMarks().stream().mapToInt(x->x).sum();
        for(Student s:ls)
            if(big<s.getMarks().stream().mapToInt(x->x).sum())
            {
                big =s.getMarks().stream().mapToInt(x->x).sum();
                ans = s;
            }
        return ans;
    }
}
