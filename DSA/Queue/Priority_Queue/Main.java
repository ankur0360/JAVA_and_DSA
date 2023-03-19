import java.util.Arrays;
import java.util.Scanner;

class Test
{
    Item[] arr = new Item[Main.length];
    int size = -1;
    class Item
    {
        public int data;
        public int priority;
    }
    public void Insert(int data,int priority)
    {        
        try
        {
            size ++;
            arr[size] = new Item();
            arr[size].data = data;
            arr[size].priority = priority;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Queue overflow");
            size --;
        }
    }
    public int Peek()
    {
        int TempIndex = -1;
        int Hpriority = Integer.MIN_VALUE;
        try
        {
            for(int i = 0;i <= size;i ++)
            {
                if(Hpriority == arr[i].priority && TempIndex > -1 && arr[TempIndex].data < arr[i].data)
                {
                    Hpriority = arr[i].priority;
                    TempIndex = i;
                }
                else if(Hpriority < arr[i].priority)
                {
                    Hpriority = arr[i].priority;
                    TempIndex = i;
                }
            }
            return TempIndex;
        }
        catch(IndexOutOfBoundsException e)
        {
            return 0;
        }
    }
    public void Delete()
    {
        try
        {
            int TempIndex = Peek();
            for (int i = TempIndex; i < size; i++) 
                arr[i] = arr[i + 1];
            size --;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Queue Underflow");
        }
    }
    public void Print()
    {
        try
        {
            for(int i = 0;i <= size;i ++)
            {
                System.out.println("Data : " + arr[i].data + " Priority : " + arr[i].priority);
            }
            System.out.println("After sorting");
            int[] pArr = new int[size + 1];
            for (int i = 0; i <= size; i++) 
                pArr[i] = arr[i].priority;
            Arrays.sort(pArr);
            for (int i = size; i >= 0; i--)
                for (int j = size; j >= 0; j--) 
                {
                    if(pArr[i] == arr[j].priority)
                        System.out.println("Data : " + arr[j].data + " Priority : " + arr[j].priority);
                }
            System.out.println("\n");
        }
        catch(Exception e)
        {
            return;
        }
    }
}
class Main
{
    static int length;
    Main()
    {
        System.out.print("Enter the length of the Queue : ");
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        this.length = length;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Test t = new Test();
        t.Insert(5, 2);
        t.Insert(4, 1);
        t.Insert(6, 7);
        t.Insert(1, 0);
        t.Print();
        //t.Delete();
        t.Delete();
        t.Print();
        int i = t.Peek();
        try
        {
            System.out.println("Peek value is : " + t.arr[i].data);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Peek value is negative due deletion");
        }        
    }
}
