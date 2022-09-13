class Test         
{
	void disp(int a)    // creating a parameterized member 
	{
		System.out.println("First disp value is : " + a);
	}
	void disp(String b) // creating a parameterized member but here the parameter is changed
	{
		System.out.println("Second disp String is : " + b);
	}
}
class Main
{
	public static void main(String[] args)
	{
		Test t = new Test();    // creating Test class object
		t.disp(5);              // calling the Integer parameterized disp member through Test class object 't'
		t.disp("Hello");        // calling the String parameterized disp member through Test class object 't'
	}
}
