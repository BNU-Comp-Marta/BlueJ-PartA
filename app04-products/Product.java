/**
 * Presents details of products that 
 * are ready to be
 * sold by the company
 * 
 * @author Marta Cyrn
 * @version 0.1 07.11.20
 */
public class Product
{
    // Attributes

    private int id;

    private String name;

    private int quantity;

    /**
     * Constructor for objects
     * details in class Product
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * Returns product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * Returns product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets a name to the product
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Returns quantity 
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Returns the id, name and quantity 
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * A method that provides
     * information about 
     * amount of a needed product
     */
    public void deliver(int amount)
    {
        if(amount > 0)
        {
            quantity += amount;
        }
        else
        {
            System.out.println("Attempt to restock " + name + 
                "with a negative or zero amount: " + amount);
        }
    }
   
    /**
     * A method to sell one of products
     * A message is displayed when none is in stock
     */
    public void sell(int saleQuantity)
    {
        if(saleQuantity > quantity)
        {
            System.out.println("Only " + quantity + " " + name +
                " in stock, but there were " +
                saleQuantity + " ordered " );
                
            quantity = 0;
        }
        else
        {
            System.out.println("Selling " + saleQuantity +
                " of stock item: " + name);
                quantity -= saleQuantity;
        }
    }
}
