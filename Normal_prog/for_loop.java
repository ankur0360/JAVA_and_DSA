import static java.lang.System.out;                    // no required to write System in printf/println
import java.util.*;
public class loop
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);               // creating a new scanner variable for scanning 
		out.printf("Enter the size of the array : ");
		int a = s.nextInt();                              // taking user input in integer format
		int[] arr = new int[a];                           // defining an array
		for(int i = 0;i < a; i++)                         // for loop syntax is same as C language
		{	
			out.printf("Enter the %d element : ",i + 1);
			arr[i] = s.nextInt();                           // inserting value in array from user 
		}
		out.printf("The array is : ");
		for(int i = 0;i < a; i++)
			out.printf("%d  ",arr[i]);                      // printing array
	}
}
