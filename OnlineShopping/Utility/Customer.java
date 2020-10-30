package OnlineShopping.Utility;

import java.util.Date;

public class Customer extends Person
{
    private String customerId;
    private String address;
    private String phone;
    private String email;
    public Customer(){}
    public Customer(String name, Date dob,String gender,String customerId,String address,String phone,String email)
    {
        super(name,dob,gender);
        this.customerId = customerId;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
