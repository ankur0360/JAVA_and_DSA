import static java.lang.System.*;   // no need to write System in print statement[line(8)]
import java.util.*;                 // importing Scanner class
class Test
{
	void Leap(int a)                  // creating member of class Test
	{
		if(a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
			out.println(a + " is a Leap year.");
		else
		out.println(a + " is not a Leap year.");
	}
}
class Main
{
	public static void main(String[] args)
	{
		int n ;
		Scanner scn = new Scanner(System.in);  // creating Scanner object
		out.printf("Enter a Year : ");
		n = scn.nextInt();                     // taking user input
		Test t = new Test();                   // crating object of class Test
		t.Leap(n);                             // calling the Test class parameterized member
	}
}
