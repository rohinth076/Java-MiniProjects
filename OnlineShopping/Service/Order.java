package OnlineShopping.Service;

import OnlineShopping.Utility.Customer;
import OnlineShopping.Utility.Item;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order
{
    private long orderId;
    private Date orderDate;
    private String orderStatus;
    private double orderAmount;
    private double amountAfterDiscount;
    Customer c;
    List<Item> li ;
    public Order(){}
    public Order(long orderId,Date orderDate,String orderStatus,double orderAmount,double amountAfterDiscount,Customer c)
    {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderAmount = orderAmount;
        this.amountAfterDiscount = amountAfterDiscount;
        li = new ArrayList<>();
        this.c = c;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    public void setAmountAfterDiscount(double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }
    public void addItem(Item i)
    {
        li.add(i);
    }

    public List<Item> getLi() {
        return li;
    }
}
