package com.itech;

public interface StudentMgmtInterface {
    boolean addStudent(Student s);
    boolean deleteStudent(long rollNo)throws StudentDoesntExist;
    void listStudent();
    boolean updateStudent(long rollNo,Student std)throws StudentDoesntExist;
    Student findTopper();
}
