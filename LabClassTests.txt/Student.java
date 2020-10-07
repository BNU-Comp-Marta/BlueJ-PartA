import java.util.ArrayList;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2011.07.31
 * Modified by Marta Cyrn
 */
public class Student
{
    // Attributes
    private String name;
    
    private String id;
    // BSc course has 115 credits, each module has 25 credits
    private int credits; 
    
    private ArrayList<Course> courses;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    
    {
        name = "Robert";
        id = "22456";
        credits = 20;
        name = "Aiden";
        id = "41572";
        credits = 20;
        name = "James";
        id = "77893";
        credits = 20;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name; 
    }

    /**
     * Set a new name for this student.
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
     * Add some credit points to the student's accumulated credits.
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
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
}
