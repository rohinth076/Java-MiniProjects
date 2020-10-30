package OnlineShopping.Exceptions;

public class OrderAlreadyFulfilled extends Exception
{
    String string;
    public OrderAlreadyFulfilled(){}
    public OrderAlreadyFulfilled(String string)
    {
        super(string);
        this.string = string;
    }
    public String toString()
    {
        return string;
    }
}
