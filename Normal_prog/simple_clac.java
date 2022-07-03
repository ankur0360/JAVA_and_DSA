import static java.lang.System.out;                     // no required to write System in printf/println
import java.util.*;
public class calc
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);               // creating a new scanner variable for scanning 
		out.printf("Enter first number : ");
		float a = scn.nextFloat();                          // taking user input in float format
		out.printf("Enter second number : ");
		float b = scn.nextFloat();                          // taking user input in float format
		out.printf("Enter operator : ");
		String c = scn.next();                              // taking user input in string format for selecting the operations
		if(c.equals("*"))
			out.printf("The answer is : %.2f",a * b);         // print the value through the operation
		else if(c.equals("+"))
			out.printf("The answer is : %.2f",a + b);
		else if(c.equals("-"))
			out.printf("The answer is : %.2f",a - b);
		else if(c.equals("/"))
			out.printf("The answer is : %.2f",a / b);
		else if(c.equals("%"))
			out.printf("The answer is : %.2f",a % b);
		else
			out.printf("Please enter a arithmatic operator.");
	}
}
