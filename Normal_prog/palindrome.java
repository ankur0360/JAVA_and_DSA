import static java.lang.System.out;            // no required to write System in printf/println
import java.util.*;
public class palimdrome
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);     // creating a new scanner variable for scanning 
		out.printf("Enter something : ");
		String a = scn.nextLine();                // taking user input in string format
		StringBuffer b = new StringBuffer(a);     // creating a Stringbuffer for reversing
		b.reverse();                              // using reverse funtion
		String c = b.toString();                  // converting Stringbuffer to string
		if(a.equals(c))                           // if we compare two string then we use variable.equals(variable)
			out.printf("Palindrome");
		else
			out.printf("Not Palindrome");
	}

}
