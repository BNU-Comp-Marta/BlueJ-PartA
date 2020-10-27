
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
    
    private int module1Mark;
    private int module2Mark;
    private int module3Mark;
    private int module4Mark;
    
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
        module2 = new Module("3D Modelling", "CO366");
        module3 = new Module("Animation", "G771");
        module4 = new Module("Computer Architecture", "CO284");
    }
    
    /**
     * Method to add 4 modules to the Course
     */
    public void addModule(String moduleName, String moduleCode)
    
    {   noModules ++;
        
         if(noModules == 1)
         {
             module1 = new Module(moduleName, moduleCode);
         }
         else if (noModules == 2)
         {
            module2 = new Module(moduleName, moduleCode);
         }
         else if (noModules == 3)
         {
             module3 = new Module(moduleName, moduleCode);
         }
         else if (noModules == 4)
         {
             module4 = new Module(moduleName, moduleCode);
         }
    }
    
    /** Method to print module name
     * 
     */
    public void printModulesDetails(String moduleName)
    {
        if (moduleName == module1.getName())
        {
            System.out.println ("...................");
            module1.print();
        }
        else if (moduleName == module2.getName())
        {
            System.out.println ("...................");
            module2.print();
        }
       else if (moduleName == module3.getName())
       {
           System.out.println ("...................");
           module3.print();
       }
       else if (moduleName == module4.getName())
       {
           System.out.println ("...................");
           module4.print();
       }
    }
    
     /**
     * Sets a mark to latter grade calculation
     */
    public void setModuleMark(int mark, int moduleNo)
    {
    if(moduleNo == 1)
    {
        module1.setMark(mark);
        module1Mark = mark;
   }
   else if(moduleNo == 2) 
   { 
       module2.setMark(mark);
       module2Mark = mark;
   }
   else if(moduleNo == 3)
   { 
       module3.setMark(mark);
       module3Mark = mark;
   }
   else if(moduleNo == 4)
   {
       module4.setMark(mark);
       module4Mark = mark;
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
           System.out.println("Your grade is " + finalGrade);
        }
        else if((finalMark >= 40) && (finalMark < 50))
        {
            finalGrade = Grades.D;
            System.out.println("Your grade is " + finalGrade);
        }
        else if((finalMark >=50) && (finalMark < 60))
        {
            finalGrade = Grades.C;
            System.out.println("Your grade is " + finalGrade);
        }
        else if((finalMark >=60) && (finalMark < 70))
        { 
            finalGrade = Grades.B;
            System.out.println("Your grade is " + finalGrade);
        }
        else if((finalMark >=70) && (finalMark < 100))
        {
            finalGrade = Grades.A;
            System.out.println("Your grade is " + finalGrade);
        }
   }
    
    /**
     * A method that prints the course details
     */
    public void print()
    {
        if (noModules <= 3)
        {
        System.out.println("You need 4 modules");
        System.out.println("Current number of modules: " + noModules);
        } 
        else
        {
            module1.print();
            module2.print();
            module3.print();
            module4.print();
            System.out.println ("................................");
            System.out.println ("Course: " + title + ", Course ID: " + codeNumber);
            System.out.println (".................................");
            System.out.println ("Your grade is: " + finalGrade);
        }
    }
}
