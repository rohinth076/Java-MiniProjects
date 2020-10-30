package OnlineShopping.Utility;

import OnlineShopping.Utility.Customer;

import java.util.Date;

public class Previlege extends Customer
{
    private double discountPercent;
    public Previlege(){}
    public Previlege(String name, Date dob, String gender, String customerId, String address, String phone, String email,double discountPercent)
    {
     super(name,dob,gender,customerId,address,phone,email);
     this.discountPercent = discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }
}
