
/**
 * This class includes information
 * about the title of course and 
 * its UCAS code
 *
 * @author Marta Cyrn
 * @version 0.2 8/10/2020
 */
public class Course
{
    //Attributes
    
    private String title;
    
    private String codeNumber;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int noModules;
    
    private int finalMark;
    
    private Grades finalGrade;
    
    /**
     * Constructor for Course's objects
     */
    public Course(String title, String code)
    {
        this.title = title;
        codeNumber = code;
    }
    
    /**
     * A method that allows printing
     */
    public void print()
    {
        System.out.println("Course: " + title + ", Code " + codeNumber);
    }   
}
