class Parent        // creating parent class
{
	void hello()      // creating memmber
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent  // here 'Child' class extends his 'Parent' property 
{
	void hello()      // creating same member in 'Child' class
	{
		System.out.println("Child class");
	}
	void call()
	{
		this.hello();  // 'this' keyword is use for to call its own class member
		super.hello(); // 'super' keyword is use for to call its Parent class member
	}
}
class Main
{
	public static void main(String[] args)
	{
		Child c = new Child();  // creating object of class 'Child'
		c.call();               // calling member through object
	}
}
