package OnlineShopping.Service;

import OnlineShopping.Exceptions.NotEnoughStock;
import OnlineShopping.Exceptions.OrderAlreadyFulfilled;
import OnlineShopping.Exceptions.OrderNotFound;
import OnlineShopping.Service.Order;
import OnlineShopping.Utility.Item;
import OnlineShopping.Utility.OnlineShoppingInterface;
import OnlineShopping.Utility.Supplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class OnlineShoppingSystem implements OnlineShoppingInterface
{
     public ArrayList<Order> lo;
     ArrayList<Supplier>ls;

    public OnlineShoppingSystem()
    {
        lo = new ArrayList<>();
        ls = new ArrayList<>();
    }
    @Override
    public boolean addOrder(Order o)
    {
        lo.add(o);
        o.setOrderStatus("In-progress");
        return true;
    }

    @Override
    public boolean cancelOrder(long orderId) throws OrderNotFound
    {
        List <Order> a = lo.stream().filter(i->i.getOrderId()==orderId).limit(1).collect(Collectors.toList());
        if(!a.isEmpty()) {
            lo.remove(a.get(0));
            return true;
        }
        return false;

    }

    @Override
    public boolean cancelItem(long orderId, int itemId) throws OrderNotFound
    {
        List <Order> a = lo.stream().filter(i->i.getOrderId()==orderId).limit(1).collect(Collectors.toList());
        if(a.isEmpty())return false;
        for(Item i : a.get(0).getLi()) {
            if (i.getItemId() == itemId)
                a.get(0).li.remove(i);
            return true;
        }
        return false;
    }

    @Override
    public boolean fulfillOrder(long orderId) throws OrderAlreadyFulfilled, NotEnoughStock
    {
        List <Order> a = lo.stream().filter(i->i.getOrderId()==orderId).limit(1).collect(Collectors.toList());
        if(!a.isEmpty())
        {
            if(a.get(0).getOrderStatus().equals("Fulfilled"))
                throw new OrderAlreadyFulfilled("Already fullfilled");
            if(a.get(0).getOrderStatus().equals("In-progress")) {
                a.get(0).setOrderStatus("Fulfilled");
                return true;
            }
        }
        return false;
    }

    @Override
    public HashMap<Integer, Integer> getStockDetails() {
        return null;
    }

    @Override
    public ArrayList<Order> listOrderbyPrice() {
        lo.sort((s1, s2) -> (int) (s1.getOrderAmount() - s2.getOrderAmount()));
        return lo;
    }

    public void setLs(Supplier s)
    {
        ls.add(s);
    }
}
