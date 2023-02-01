import java.util.Scanner;
class Test
{
    int n = 0;
    Stack top;
    int value;
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
        {    
            top = newS;
            n++;
        }
        else
        {
            newS.next = top;
            top = newS;
            n++;
        }
    }
    public void pop()
    {
        int[] arr = new int[n];
        Stack copy = top;
        System.out.print("Enter the position of the data which you want ot pop : ");
        Scanner scn = new Scanner(System.in);
        int pos = scn.nextInt();
        if(pos == 1)
        {
            System.out.println("Deleting item : " + top.data);
            top = top.next;
        }
        else
        {
            for(int i = 2,x = 0;i <= n;i ++,x ++)
            {
                arr[x] = copy.data;
                if(i == pos)
                {
                    value = copy.next.data;
                    Stack next = copy.next.next;
                    copy.next = next;
                    arr[x] = copy.data;
                    x++;
                }
                
                copy = copy.next;
            }
            ArrayStore(arr);
        }
    }
    public void ArrayStore(int[] arr)
    {
        int[] ar2 = new int[10];
        for(int i = 0;arr[i] != 0;i ++)
        {
            System.out.println("Popped item : " + arr[i]);
            ar2[i] = arr[i];
        }
        System.out.println("Deleting item : " + value);
        for(int i = ar2.length - 1;i >= 0;i --)
        {
            if(ar2[i] == 0)
                continue;
            else
                System.out.println("Pushing item : " + ar2[i]);
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
class delete_ele_through_position_in_stack
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
        t.pop();
        t.printStack();
    }
}
