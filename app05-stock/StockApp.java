
/**
 * This class provides 
 * a user interface of stock manager 
 * Users can modify products
 *
 * @author Marta Cyrn
 * @version 0.1 29.11.20
 */
public class StockApp
{
    // Attributes
    
    private InputReader input;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
    }

    /**
     * Runs and displays an input menu
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getInput();
            finished = true;
        }
    }
    
    /**
     * Prints out a menu of available choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Prints the program's 
     * title and its author's name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: Marta Cyrn");
        System.out.println("******************************");
    }
}
