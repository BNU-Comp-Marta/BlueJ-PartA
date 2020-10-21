import java.util.Date;
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
 
 private Date datePurchased = new Date();
 
    /**
     * Information about destination and price
     *
     */
    public Ticket ()
    {
        price = 220;
        destination = "Aylesbury";
        datePurchased = new Date();
    
        price = 300;
        destination = "Amersham";
        datePurchased = new Date();
        
        price = 330;
        destination = "HighWycombe";
        datePurchased = new Date();
    }
    
    /**
     * Constructor of tickets information
     */
    public Ticket (String destination, int price)
    {
        this.price = price;
        this.destination = destination;
        datePurchased = new Date();
    }
    
   
    /**
     * A constructor that gives a ticket the price
     * 
     */
    public int getPrice (int price)
    {
        return price;
    }
    
    /**
     * A constructor that informs about destination
     * 
     */
    public String getDestination()
    {
        return destination;
    }
    
    public void print()
    {
        System.out.print("Destination: " + destination);
        System.out.println(" Price " + price + " pounds");
    }

}
