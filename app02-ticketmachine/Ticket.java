
/**
 * This class will include general information
 * about tickets e.g. prices.
 *
 * @author Marta Cyrn
 * @version 0.1 19.10.2020
 */
public class Ticket
{
 private String destination;
 
 // this is in pounds
 private int price;
 
    /**
     * Constructor for prices of tickets 
     * and their destinations for class Ticket
     */
    public Ticket()
    {
        price = 220;
        destination = "Aylesbury";
    }
    
    /**
     * 
     */
    public Ticket (String destination, int price)
    {
        this.price = price;
        this.destination = destination;
        
    }
    
   
    /**
     * A method that allows to
     * print the prices
     */
    public void setPrice (int price)
    {
        this.price = price;
    }
    
}
