import static java.lang.System.*;
import java.util.*;
class Test
{
	void duplicate(int a, int[] b)
	{
		int[] t = new int[a];
		int j = 0;
		Arrays.toString(b);
		Arrays.sort(b);
		for(int i = 0;i < a - 1; i++)
		{
			if(b[i] != b[i + 1])
			{
				t[j++] = b[i];
			}
		}
		t[j++] = b[a - 1];
		System.out.println("Printing the unique elements of the array : ");
		for(int i = 0;t[i] != 0;i ++)
			System.out.print(t[i] + " ");
	}
}
class Main
{
	public static void main(String[] args)
	{
		out.printf("Enter the size of the array : ");
		int x;
		Scanner scn = new Scanner(System.in);
		x = scn.nextInt();
		int[] y = new int[x];
		for(int i = 0;i < x;i++)
		{	
			out.printf("Enter %d element : ",i + 1);
			y[i] = scn.nextInt();
		}	
		Test t = new Test();
		t.duplicate(x,y);	
	}
}
