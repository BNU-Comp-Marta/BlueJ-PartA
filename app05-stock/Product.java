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
    
    private int minStockLevel;

    /**
     * Constructor for objects
     * details in class Product
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Removes products
     */
    public void removeProduct()
    {
        name = null;
        quantity = 0;
        id = 0;
    }
   
    /**
     * Sets a name to the product
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return The quantity in stock
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * A method that provides
     * information about 
     * amount of a needed product
     * @param amount The number of new items added to the stock
     */
    public void deliver(int amount)
    {
        if(amount > 0)
        {
            quantity += amount;
            System.out.println("Delivered " + amount + " " + name);
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
