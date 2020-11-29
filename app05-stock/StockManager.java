import java.util.ArrayList;

/**
 * The class that
 * contains data of all 
 * the products in stock
 * 
 * @author Marta Cyrn
 * @version 0.1 07.11.20
 */
public class StockManager
{
    // Attributes

    private ArrayList<Product> stock;

    /**
     * Initialises the stock manager
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Adds products to the list
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Finds a product from 
     * stock by inserting its id
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * Displays the number of
     * the amount of 
     * all products available
     */
    public int numberProductsInStock()
    { 
        return stock.size();
    }
    
    /**
     * A method that will
     * print the details of a particulat 
     * product with an inserted id
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print details of all the products
     */
    public void printAllProducts()
    {
        printHeading();
        
        for(Product product : stock)
        {
            //product.print();
            System.out.println(product);
        }
    }
    
    /**
     * A method to print out the heading
     */
    public void printHeading()
    {
        System.out.println();
        System.out.println("====================");
        System.out.println("Cyrn's Stock List");
        System.out.println("====================");
        System.out.println();
    }
    
}