class Main
{
	public static void main(String[] args)
	{
		System.out.printf("The args is : %s %s",args[0],args[1]); // it will takes the user input the run command is exhecuted
	}
}

// defaultly the args are taking String input if you want to give int format then you have to follow this -->

class Main
{
  public static void main(String[] args)
	{
		int n, n1;
    n = Integer.parseInt(args[0]);    // this statement converts the String args into Integer
    n1 = Integer.parseInt(args[1]);
    System.out.printf("The sum of the args is : %d",n + n1);
	}
}
