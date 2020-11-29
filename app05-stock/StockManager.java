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
     * @param item The item to be added
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * A method that allows to rename the product
     */
    public void renameProduct(int id, String name)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.setName(name);
        }
        else
        {
            printInvalidID();
        }
    }

    /**
     * A method that allows to search for a product
     */
    public void printName(String findName)
    {
        printHeading();
        System.out.println("Products Names with: '" + findName + "':");
        for (Product product : stock)
        {
            if(product.getName().contains(findName))
            {
                System.out.println(product);
            }
        }
    }
    
    /**
     * A method that allows to delete product
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if (product !=null)
        {
            product.removeProduct();
        }
        else
        {
            printInvalidID();
        }
    }

    /**
     * Prints out if the id is invalid
     */
    private void printInvalidID()
    {
        System.out.println("The id you have entered is invalid");
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
     * Prints all the products
     */
    public void printAllProducts()
    {
        printHeading();

        for(Product product : stock)
        {
            System.out.println(product);
        }
        System.out.println();
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

    /**
     * Sells all the products.
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);
        
        if(product != null)
        {
            product.sell(quantity);
        }
    }
    
    /**
     * A method that restocks a product
     */
      public void restock()
    {
        for(Product product : stock)
        {
            if(product.getQuantity() < 5)
            {
                product.deliver(10);
            }
        }
    }
}