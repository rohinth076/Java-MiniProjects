package OnlineShopping.Test;

import OnlineShopping.Service.OnlineShoppingSystem;
import OnlineShopping.Service.Order;
import OnlineShopping.Utility.Customer;
import OnlineShopping.Utility.Item;
import OnlineShopping.Utility.Supplier;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Testing
{
    public static void main(String[] args) {

        Customer customer;
        OnlineShoppingSystem test = new OnlineShoppingSystem();
        Scanner sc  = new Scanner(System.in);
        customer = new Customer("Simren",new Date(2001,6,18),"Female","12345","15-chennai","9807654321","simren32@gmail.com");


       Supplier supplier = new Supplier(56372,"Bala","13-2 chennai");
       int choice = 0;
       int i =1;
       do {
           System.out.println("Enter your choice");
           System.out.println("Addorder --> 1");
           System.out.println("CancelOrder-->2");
           System.out.println("CancelItem--->3");
           System.out.println("Fulfillorder-->4");
           System.out.println("getStockDetails-->5");
           System.out.println("Listorderbyprice-->6");
           System.out.println("Exit-->7");
           choice = sc.nextInt();
           int c = 0;
           long orderId;
           Item item;
           int itemId;
           try {
           switch (choice) {
                   case 1:
                       Order order = new Order(25671 + i, new Date(2020, 7, 18), "Order", 1500 + i, 1500 + i - 200, customer);
                       test.lo.add(order);
                       do {
                           item = new Item(12890 + i, "Chipps", 15 + i * 5);
                           order.addItem(item);
                           System.out.println("Want to add one more item -yes(1),no(2)");
                           c = sc.nextInt();
                           i += 1;
                       } while (c == 1);
                       break;
                   case 2:
                       System.out.println("Enter orderId");
                     orderId = sc.nextLong();
                       System.out.println("Is order is Cancelled?"+test.cancelOrder(orderId));
                       break;
               case 3:
                   System.out.println("Enter orderId & itemId");
                    orderId = sc.nextLong();
                    itemId = sc.nextInt();
                    System.out.println("Is item is Cancelled?"+test.cancelItem(orderId,itemId));
                    break;
               case 4:
                   System.out.println("Enter orderId");
                   orderId = sc.nextLong();
                   System.out.println("Is order is fulfilled?"+test.fulfillOrder(orderId));
                   break;
               case 6:
                   ArrayList<Order> alist = test.listOrderbyPrice();
                   for(Order al:alist)
                       System.out.println(al);
                   break;
               case 7:
                   break;
               default:
                   System.out.println("Wrong choice");
           }
           }catch(Exception e)
           {
               System.out.println(e.toString());
           }
       }while(choice!=7);


    }
}
