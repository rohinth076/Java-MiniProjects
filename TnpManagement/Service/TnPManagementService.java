package TnpManagement.Service;

import TnpManagement.Utility.Student;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TnPManagementService {
    public List<Student> getEligibleStudents(List<Student> students,String branch,float cgpa)
    {
        return students.stream().filter(i->i.getCgpa()>cgpa && i.getBranch().equals(branch))
                .collect(Collectors.toList());
    }
    public int getPlacedStudentsCount(List<Student> students)
    {
        return (int)students.stream().filter(i->i.isPlacementStatus()).count();
    }
    public Student getStudent(List<Student> students,int regNo)
    {
        try {
            return students.stream().filter(i -> i.getRegNo() == regNo).collect(Collectors.toList()).get(0);
        }catch (Exception e){return null;}
    }
    public List<Student> updatePlacementStatusAndSort(List<Student> students,int regNo,String company)
    {
        for(Student i:students){
            if(i.getRegNo() == regNo){
                i.setPlacementStatus(true);
                i.setCompany(company);
                break;
            }
        }
        Collections.sort(students,(i,j)-> (int) (j.getCgpa() - i.getCgpa()));
        return students;
    }
}
