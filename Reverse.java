
/**
 * A guess the password program.
 *
 * @author Nicolas Gross
 * @version 11/20/18
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "DESTIJL";
    
    static String obfuscate(String input)
    {
        return input.replace('D','L').replace('I', 'Y').concat("PIET");
    }
    public static void main(String [] args) 
    {
        if (args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one argument:\njava Reverse <argument>");
            return;
        }
        
        if (args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You win! Congratulations!");
        }
        else
        {
            System.out.println("Wrong password! Try again!");
        }
    }
}
