package TnpManagement.Test;

import TnpManagement.Service.TnPManagementService;
import TnpManagement.Utility.Student;

import java.util.ArrayList;
import java.util.List;

public class TnPManagementDemo {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        TnPManagementService t = new TnPManagementService();
        studentList.add(new Student(1001,"A","EEE",6.5f,false,null));
        studentList.add(new Student(1002,"B","ECE",7.5f,false,null));
        studentList.add(new Student(1003,"C","EEE",5.5f,false,null));
        studentList.add(new Student(1005,"D","CSE",8.5f,false,null));
        studentList.add(new Student(1006,"E","ECE",7.5f,false,null));
        studentList.add(new Student(1007,"F","EEE",6.5f,false,null));
        System.out.println(t.getEligibleStudents(studentList,"EEE",6f));
        System.out.println(t.updatePlacementStatusAndSort(studentList,1001,"Google"));
        System.out.println(t.getStudent(studentList,1005));
        System.out.println(t.getPlacedStudentsCount(studentList));
    }
}
