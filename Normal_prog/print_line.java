import static java.lang.System.out;           // no required to write System in printf
import java.util.*;
public class A
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);    // creating a new scanner variable for scanning 
		out.printf("Enter Something : ");
		String a = scn.nextLine();               // taking user input in string format
		out.printf("You have written : %s",a);   // printing the user input 
	}
}
