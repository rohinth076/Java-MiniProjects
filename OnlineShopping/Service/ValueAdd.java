package OnlineShopping.Service;

import OnlineShopping.Utility.Customer;

import java.util.Date;

public class ValueAdd extends Customer
{
    private long bonusPoints;
    public ValueAdd(){}
    public ValueAdd(String name, Date dob, String gender, String customerId, String address, String phone, String email,long bonusPoints)
    {
        super(name,dob,gender,customerId,address,phone,email);
        this.bonusPoints = bonusPoints;
    }

    public long getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(long bonusPoints) {
        this.bonusPoints = bonusPoints;
    }
}
