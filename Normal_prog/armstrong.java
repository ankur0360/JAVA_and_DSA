import static java.lang.System.out;               // no required to write System in printf/println
import java.lang.Math;                            // importing math module
import java.util.*;
public class arm
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);           // creating a new scanner variable for scanning 
		out.printf("Enter a number : ");
		int a = s.nextInt();                          // taking user input in integer format
		int b,t = 0,c = 0,d = a;
		while (a != 0)
		{		
			a = a / 10;
			c++;
		}
		a = d;
		while (a != 0)
		{		
			b = a % 10;
			t += Math.pow(b,c);                         // using pow function -> pow(value,power) 
			a = a / 10;
		}
		if (t == d)
			out.printf("%d is a Armstrong number.",d);
		else
			out.printf("%d is not a Armstrong number.",d);
	}

}
