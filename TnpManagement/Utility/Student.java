package TnpManagement.Utility;

public class Student {
    private int regNo;
    private String name;
    private String branch;
    private float cgpa;
    private boolean placementStatus;
    private String company;

    public Student(int regNo, String name, String branch, float cgpa, boolean placementStatus, String company) {
        this.regNo = regNo;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.placementStatus = placementStatus;
        this.company = company;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public boolean isPlacementStatus() {
        return placementStatus;
    }

    public void setPlacementStatus(boolean placementStatus) {
        this.placementStatus = placementStatus;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo=" + regNo +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", cgpa=" + cgpa +
                ", placementStatus=" + placementStatus +
                ", company='" + company + '\'' +
                '}';
    }
}
