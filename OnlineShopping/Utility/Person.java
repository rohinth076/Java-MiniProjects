package OnlineShopping.Utility;

import java.util.Date;

public class Person {
    private String name;
    private Date dob;
    private String gender;
    public Person(){}

    public Person(String name, Date dob, String gender)
    {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }
}
