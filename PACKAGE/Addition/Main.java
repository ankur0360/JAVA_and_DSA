import mypack.*;          // importing all packages from mypack folder
import static java.lang.System.*;
class Main
{
	public static void main(String[] args)
  {
		bye bh = new bye();   // creating new object
		bh.disp1();           // calling the disp1 function
		out.println("The sum of two number is : " + (bh.a + bh.b));
	}
}
