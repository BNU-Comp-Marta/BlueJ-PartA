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
    //Attributes
 private String destination;
 
 // this is in pence
 public int price;
 
 private Date datePurchased = new Date();
    
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
    
    /**
     * Allows to show the destination 
     * and prices of each ticket
     */
    public void print()
    {
        System.out.println("##################");
        System.out.println("# the BlueJ line");
        System.out.println("#Ticket: " + destination);
        System.out.println(" Price " + price + " pence");
        System.out.println("##################");
        
    }

}
