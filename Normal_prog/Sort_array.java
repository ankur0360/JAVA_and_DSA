import static java.lang.System.*;       // no required to type System in prinnt statement
import java.util.*;                     // for Scannner class
class test
{
	Scanner scn = new Scanner(System.in); // creating Scanner object
	void disp(int a,int[] b)
	{
		out.println("Enter elements : ");
		for(int i = 0;i < a;i ++)
			b[i] = scn.nextInt();             // taking user input
		out.println("Before sorting : " + Arrays.toString(b));  // it will print the array without a loop and it takes less time to print
		Arrays.sort(b);                     // sorting array elements
		out.printf("After sorting : " + Arrays.toString(b));
	}
}
class Main
{
	public static void main(String[] args)
	{
		int x;
		Scanner scn = new Scanner(System.in);
		out.print("Enter the size of the array : ");
		x = scn.nextInt();
		int[] y = new int[x];               // declaration of array of the user size [x]
		test t = new test();                // creating object of class test
		t.disp(x,y);                        // calling the parameterized member of class test through its object
	}
}
