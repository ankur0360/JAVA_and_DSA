abstract class Test
{
	static void hello()   // 'static' keyword use for to allocate memory and no need to make call by object
	{
		System.out.println("Hello");
	}
}
class Main
{
	public static void main(String[] args)
	{
		/*Test t = new Test(); --> if we write this statement it through an error beacause of we can not
    make abstract class object*/
	  Test.hello();	// we can not make object but we can take reference through static 
	}
}
