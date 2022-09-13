import static java.lang.System.*;   // no need to write Sysyytem in print statement
import java.util.*;                 // importing Scanner class
class Test
{
	void Prime(int a)                 // creating a parameterized member
	{
		int temp = 0;
		for(int i = 1;i <= a;i ++)
		{
			for(int j = 2;j <= i/2;j ++)
			{
				if(i % j == 0)
				{	
					temp = 1;
					break;                    // if temp == 1 then its break the loop for time saving
				}
			}
			if(temp == 0)                 // if temp value still not changing to 1 then the number is Prime
				out.printf("%d\t",i);
			temp = 0;                     // after the second loop temp value is assign as 0
		}
	}
}
class Main
{
	public static void main(String[] args)
	{
		int n ;
		Scanner scn = new Scanner(System.in);     // creating Scanner object
		out.printf("Enter the maximum number : ");
		n = scn.nextInt();               // taking user input
		Test t = new Test();             // creating Test class object
		t.Prime(n);                      // calling the Prime member through Test class object 't'
	}
}
