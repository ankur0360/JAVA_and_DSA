import java.util.Scanner;

class Test
{
    Stack top;
    class Stack
    {
        Stack next;
        int data;
        Stack(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data)
    {
        Stack newS = new Stack(data);
        if(top == null)
            top = newS;
        else
        {
            newS.next = top;
            top = newS;
        }
    }
    public void pop()
    {
        if(top == null)
            System.out.println("Stack is Empty");
        else {
            System.out.println("Popped item is : " + top.data);
            top = top.next;
        }
    }
    public void printStack()
    {
        Stack copy = top;
        if(top == null)
            System.out.println("Stack is Empty");
        else {
            System.out.println("Your Stack is :");
            while(copy != null)
            {
                System.out.println(copy.data);
                copy = copy.next;
            }
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Test t = new Test();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter how many item you want to insert : ");
        int n = scn.nextInt();
        for(int i = 1;i <= n; i ++)
        {
            System.out.print("Enter " + i + " element : ");
            int data = scn.nextInt();
            t.push(data);
        }
        t.printStack();
        System.out.print("Enter how many item you want to pop : ");
        int p = scn.nextInt();
        if (p <= n)
        {
            for(int i = 1;i <= p; i++)
                t.pop();
            t.printStack();
        }
        else
            System.out.println("Stack Underflow");
    }
}
