import java.util.*;

/**
 * This class includes information 
 * about student, their marks and grades
 * 
 * @author Marta Cyrn
 * @version 25.10.2020
 */
public class Student
{
    //Attributes
    
    private String name;
    
    private String id;
    
    private int credits;
    
    private Course course;
    
   
   /**
    * Gives each student and ID and names
    */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }
    
    /**
     * Gives student a course
     */
    public void addCourse(Course course)
    {
        this.course = course;
    }
    
   /**
   * Enrols students
   */
    public void enrolOnCourse(Course course)
    {
        this.course = course; 
    }
    
   /**
     * Return the full name of this student
     */
    public String getName()
    {
        return name;
    }

   /**
    * Gives student a new name
    */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Adds some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Prints the student's name and ID number
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
        course.print();
    }
}
