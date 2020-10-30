package OnlineShopping.Exceptions;

public class NotEnoughStock extends Exception
{
    String string;
    public NotEnoughStock(){}
    public NotEnoughStock(String string)
    {
        super(string);
        this.string = string;
    }
    public String toString()
    {
        return string;
    }
}
