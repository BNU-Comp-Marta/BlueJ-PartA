import java.util.HashSet;
import java.util.Scanner;

/**
 * Class InputReader reads typed text input 
 * from text terminal
 * 
 * @author     Marta Cyrn
 * @version    0.1 29.11.20
 */

public class InputReader
{
    private Scanner reader;

    /**
     * Creates InputReader that reads terminal's text 
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getString()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();

        return inputLine;
    }
}
