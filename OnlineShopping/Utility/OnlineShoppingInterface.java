package OnlineShopping.Utility;

import OnlineShopping.Exceptions.NotEnoughStock;
import OnlineShopping.Service.Order;
import OnlineShopping.Exceptions.OrderAlreadyFulfilled;
import OnlineShopping.Exceptions.OrderNotFound;

import java.util.ArrayList;
import java.util.HashMap;

public interface OnlineShoppingInterface
{
    boolean addOrder(Order o);
    boolean cancelOrder(long orderId)throws OrderNotFound;
    boolean cancelItem(long orderId,int itemId)throws OrderNotFound;
    boolean fulfillOrder(long orderId)throws OrderAlreadyFulfilled, NotEnoughStock;
    HashMap<Integer,Integer> getStockDetails();
    ArrayList<Order> listOrderbyPrice();
}
