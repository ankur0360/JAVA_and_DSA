class Test
{
    static int Disp(int x)
    {
        if(x == 0)
            return 1;
        else
        {
            return x * Disp(x -1); // recursion ,i.e calling own function
        }
    }
}
class Main
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]); // taking input through args in command "java filename input"
        System.out.println("Factorial of " + a + " number is " + Test.Disp(a));
        
    }
}
