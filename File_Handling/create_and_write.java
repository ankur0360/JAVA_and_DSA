import java.io.*;                                   // importing file and try catch module
import static java.lang.System.out;                 // no required to write System in printf/println
import java.util.*;
public class CreateFile 
{
	public static void main(String[] args) 
	{
		File file = new File("Ankur.txt");              // declare a file name
		Scanner scn = new Scanner(System.in);           // creating a new scanner variable for scanning 
		out.printf("Enter Something : ");
		String z = scn.nextLine();                      // taking user input in string format
		try
		{	boolean b = file.createNewFile();             // creating a file
			FileWriter x = new FileWriter("Ankur.txt");   // define FileWriter for write the existing file
			x.write(z);                                   // write the user input
			x.close();                                    // closing the file
		}
		catch(IOException e)
		{
			out.printf("Error genarated");
		}
	}
}
