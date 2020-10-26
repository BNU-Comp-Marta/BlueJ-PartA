
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
    
    private Grades grade;
    
    /**
     * Constructor for Course's objects
     */
    public Course(String title, String code)
    {
        this.title = title;
        this.codeNumber = code;
        noModules = 0;
        
        grade = Grades.NULL;
        createModules();
    }
    
    /**
     * Module title and UCAS code
     */
    public void createModules()
    {
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Programming Concepts", "CO452");
        module3 = new Module("Programming Concepts", "CO452");
        module4 = new Module("Programming Concepts", "CO452");
    }
    
    public void addModule(Module module)
    
    {   noModules ++;
        
         if(noModules == 1)
         {
             module1 = module;
         }
    }
    
    public void setModuleMark(int mark, int moduleNo)
   {
    if(moduleNo == 1)
    {
        module1.setMark(mark);
        module2.setMark(mark);
        module3.setMark(mark);
        module4.setMark(mark);
    }
   }
   
   /**
    * Calculates predicted grades depending 
    * on received amount of percentage 
    */
   public void calculateFinalGrade()
   {
       if(finalMark < 40)
       {
           finalGrade = Grades.F;
        }
        else if((finalMark >= 40) && (finalMark < 50))
        {
            finalGrade = Grades.D;
        }
        else if((finalMark >=50) && (finalMark < 60))
        {
            finalGrade = Grades.C;
        }
        else if((finalMark >=60) && (finalMark < 70))
        { 
            finalGrade = Grades.B;
        }
        else if((finalMark >=70) && (finalMark < 100))
        {
            finalGrade = Grades.A;
        }
   }
    
    /**
     * A method that allows printing
     */
    public void print()
    {
        System.out.println("Course: " + title + ", Code " + codeNumber);
    }   
}
