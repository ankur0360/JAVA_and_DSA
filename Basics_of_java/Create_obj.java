class Test        // defining a class
{
	void hello()    // creating a member of this class
	{
		System.out.println("Hello");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Test t ;          // here we made a reference of 'Test' class 't' 
    t = new Test();   // here the 'new' keyword made an object of class 'Test'
		t.hello();        // here we can call the 'Test' class member through the object 't'
	}
}
