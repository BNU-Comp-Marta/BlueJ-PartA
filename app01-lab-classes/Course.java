
/**
 * This class contains information about the
 * course title and its course code
 *
 * @author Marta Cyrn
 * @version 0.2 8/10/2020
 */
public class Course
{
    //Attributes
    
    private String title;
    
    private String codeNumber;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
        this.title = title;
        codeNumber = code;
    }
    
    public void print()
    {
        System.out.println("Course: " + title + ", Code " + codeNumber);
    }   
}
