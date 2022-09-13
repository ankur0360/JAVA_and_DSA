abstract class Test       // creating abstract class
{
	abstract void hello(); // also creating a abstract member its definition 
}
class Child extends Test  // 'Child' class extends its Parent class (Test)
{
	void hello()            // here the abstract class member is defined for hiding its presence
	{
		System.out.println("Hello");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Child c = new Child();  // creating 'Child'' object
		c.hello();              // calling its member through its object
	}
}
