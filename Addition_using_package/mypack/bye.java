package mypack;           // the package name should be in folder name ,cause we are accessing java file through the folder name
import java.util.*;       // For scanner 
import static java.lang.System.*;
public class bye          // Defining the public class to use it across any java file
{
	public float a,b;       // also defining this public  
	public void disp1()
	{	
		Scanner scn = new Scanner(System.in);
		out.println("Enter two numbers : ");
		a = scn.nextFloat();
		b = scn.nextFloat();		
		out.println("Exiting bye");
	}
}
