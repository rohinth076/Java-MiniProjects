package OnlineShopping.Utility;

public class Item
{
    private long itemId;
    private String name;
    private double price;
    public Item(){}
    public Item(long itemId,String name,double price)
    {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public long getItemId() {
        return itemId;
    }

    public double getPrice() {
        return price;
    }

}
