import java.util.Random;
/**
 * A class that demonstrates 
 * all the products
 * 
 * @author Marta Cyrn
 * @version 0.1 07.11.20
 */
public class StockDemo
{
    // Attributes
    private StockManager manager;

    private Random generator = new Random();

    private int amount = 0;

    /**
     * Creates stockmanager that is filled with its products
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(101, "Xp Pen Artist 12 Pro"));
        manager.addProduct(new Product(102,  "Samsung Galaxy S7 Edge"));
        manager.addProduct(new Product(103,  "Razer Blade 15"));
        manager.addProduct(new Product(104,  "Asus Rog Strix G15"));
        manager.addProduct(new Product(105,  "Xiaomi Redmi 9A"));
        manager.addProduct(new Product(106,  "Wacom Cintiq Pro 16"));
        manager.addProduct(new Product(107,  "Wacom Cintiq Pro 24"));
        manager.addProduct(new Product(108,  "Wacom Cintiq Pro 32"));
        manager.addProduct(new Product(109,  "Wacom Intuos Pro"));
        manager.addProduct(new Product(110,  "Lg G7 ThinQ"));
    }

    /**
     * A method that allows to sell 
     * all the products
     */
    private void demoSellProducts()
    {
        System.out.println("\nSelling all the products\n");

        for(int id = 101; id <= 112; id++)
        { 
            amount = generator.nextInt(4);
        }
    }

    /**
     * A method which makes it
     * possible to deliver the products
     */
    private void demoDeliverProducts()
    {
        System.out.println("\nSelling all the products\n");
        for(int id= 101; id <= 122; id++)
        {
            amount = generator.nextInt(8);
        }
    }
}
