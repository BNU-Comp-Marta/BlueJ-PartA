/**
 * TicketMachine models a ticket machine that issues tickets.
 * The price of a ticket is specified via the constructor.
 * @version 0.1 19.10.2020
 * Modified by Marta Cyrn
 */
public class TicketMachine
{
    //Attributes
    
    private int price;
   
    private int balance;
    
    private int total;
    
    private int currentBalance;
   
   private Ticket aylesburyTicket;
   
   private Ticket highWycombeTicket;
   
   private Ticket amershamTicket;
   
   private Ticket selectedTicket;

    /**
     * Creates a machine that issues tickets with the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        createTickets();
        
        aylesburyTicket = new Ticket("Aylesbury", 220);
        highWycombeTicket = new Ticket("High Wycombe", 220);
        amershamTicket = new Ticket("Amersham", 300);
        
        selectedTicket = null;
    }

    
    /**
     * This creates all the tickets available to buy
     */
    private void createTickets()
    {
        aylesburyTicket = new Ticket("Aylesbury" , 220);
        amershamTicket = new Ticket("Amersham" , 300);
        highWycombeTicket = new Ticket("HighWycombe" , 330);
        
    }
    
    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    public void insert10p()
   {
       insertMoney(10);
   }
   
   public void insert50p()
   {
       insertMoney(50);
   }
    
   public void insert100p()
   { 
       insertMoney(100);
   }
    
   public void insert200p()
  {
      insertMoney(200);
  }
    
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Allows customer to select the desination of the ticket
     */
    public void selectDestination(String stop)
    {
        if (stop == "High Wycombe" || stop == "highwycombe")
        {
            selectedTicket = highWycombeTicket;
            price = highWycombeTicket.price;
            System.out.println("High Wycombe Selected");
            
        }
        else if (stop == "Amersham" || stop == "amersham")
        {
            selectedTicket = amershamTicket;
            price = amershamTicket.price;
            System.out.println("Amersham Selected");
        }
        else if (stop == "Aylesbury" || stop == "aylesbury")
        {
            selectedTicket = aylesburyTicket;
            price = aylesburyTicket.price;
            System.out.println("Aylesbury Selected");
        }
          else
        {
              
         System.out.println("Please select a valid Destination:");
         System.out.println("Aylesbury");
         System.out.println("Amersham");
         System.out.println("High Wycombe");
        
    }
   
}
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if((balance >= price) && (selectedTicket !=null))
        
        {
            // Simulate the printing of a ticket.
            selectedTicket.print();
            System.out.println("currentBalance");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more pence.");
                    
        }
    }
/**
 * Check if you have got enough money and select a ticket.
 * Afterwards the ticket will be printed.
 */

public void printSelectedTicket()
{
    if(balance >= price)
    {
        selectedTicket.print();
        balance = balance - selectedTicket.price;
    }
    else if (selectedTicket == null)
{
    selectDestination(null);
}
else
{
    System.out.println("not enough money");
    System.out.println("Currently missing: " + (price - balance));
}   
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
   /**
    * This allows to print every ticket
    */
    private void printAllTickets()
   {
       System.out.println();
       aylesburyTicket.print();
       amershamTicket.print();
       highWycombeTicket.print();
       
    }
   
}
