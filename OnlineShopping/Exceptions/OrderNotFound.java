package OnlineShopping.Exceptions;

public class OrderNotFound extends Exception
{
    String string;
    public OrderNotFound(){}
    public OrderNotFound(String string)
    {
        super(string);
        this.string = string;
    }
    public String toString()
    {
        return string;
    }
}
