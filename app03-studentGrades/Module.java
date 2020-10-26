
/**
 * This class includes information 
 * about Module details
 *
 * @author Marta Cyrn
 * @version 0.1 25.10.20
 */
public class Module
{
    //Attributes
    
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private boolean completed;
    
    /**
     * Constructor for Module's objects
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
        completed = false;
    }
    
    /**
     * A method that sets a mark which
     * allows a student to pass a module
     */
    public void setMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
            if(mark >= 40) completed = true;
        }
    }
    
    /**
     * A method that states if a sentence is true or false
     */
    public boolean isCompleted()
    {
        return completed;
    }
    
    /**
     * A method that shows 
     * Module's marks
     */
    public int getMark()
    {
        return mark;
    }

    /**
     * Prints out all the information about module
     */
    public void print()
    {
        System.out.println("Course: " + title + ", Code " + codeNo + 
        ", Mark: " + mark);
    }
}
