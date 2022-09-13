class Parent        // declaring a Parent class 
{
	void pr()         // class member
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent  // here the 'extends' keyword use to extends the Parent property 
{
	void ch()         // class member
	{
		System.out.println("Child class");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Child c = new Child(); // creating object of class 'Child'
		c.pr();                // calling the 'Parent' class member and it does through any error beacause 'Child' class uses its Parents property
		c.ch();                // calling its own member
	}
}
