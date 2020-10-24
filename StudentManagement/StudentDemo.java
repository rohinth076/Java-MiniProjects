package com.itech;

import com.itech.Student;
import com.itech.StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        StudentManagementSystem x = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int c = 0;
        do {
            try {
                System.out.println("Enter your choice");
                System.out.println("AddStudent-->1");
                System.out.println("DeleteStudent-->2");
                System.out.println("List the student details-->3");
                System.out.println("Update Student Details--->4");
                System.out.println("Find Topper-->5");
                System.out.println("Exit-->6");
                c = sc.nextInt();
                switch (c) {
                    case 1:
                        ArrayList marks = new ArrayList<>();
                        System.out.println("Enter rollno,name,address,subject");
                        long rollNo = sc.nextLong();
                        String name = sc.next();
                        String address = sc.next();
                        String subject = sc.next();
                        for (int i = 0; i < 6; i++)
                            marks.add(r.nextInt(100));
                        x.addStudent(new Student(rollNo, name, address, subject, marks));
                        break;
                    case 2:
                        System.out.println("Enter Roll no");
                        rollNo = sc.nextLong();
                        System.out.println("Is deleted ?"+x.deleteStudent(rollNo));
                        break;
                    case 3:
                        x.listStudent();
                        break;
                    case 4:
                        marks = new ArrayList<>();
                        System.out.println("Enter rollno,name,address,subject");
                        rollNo = sc.nextLong();
                        name = sc.next();
                        address = sc.next();
                        subject = sc.next();
                        for (int i = 0; i < 6; i++)
                            marks.add(r.nextInt(100));
                        x.updateStudent(rollNo,(new Student(rollNo, name, address, subject, marks)));
                        break;
                    case 5:
                        System.out.println("Topper :"+x.findTopper());
                        break;
                    case 6:
                        System.out.println("Program ends");
                        break;
                    default:
                        System.out.println("Wrong choice");
                }
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }while(c!=6);
    }
}
