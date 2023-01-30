class Test
{
    int n = 0;
    Queue top;
    class Queue
    {
        Queue next;
        int data;
        Queue(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    void push(int data)
    {
        Queue Bottom = new Queue(data);
        System.out.println("Pushing data : " + data);
        if(top == null)
        {
            top = Bottom;
            n ++;
        }
        else
        {
            Bottom.next = top;
            top = Bottom;
            n ++;
        }
    }
    void Disp()
    {
        Queue copyQueue = top;
        if(top == null)
            System.out.println("Queue empty");
        else
        {
            System.out.println("The Queue data is : ");
            while(copyQueue != null)
            {
                System.out.println(copyQueue.data);
                copyQueue = copyQueue.next;
            }
        }
    }
    void pop()
    {
        Queue copyQueue = top.next;
        Queue copy = top;
        try{
            while(copyQueue.next != null)
            {
                copy = copy.next;
                copyQueue = copyQueue.next;
            }
            System.out.println("Popped item is : " + copy.next.data);
            copy.next = null;
            n --;

        }
        catch (NullPointerException e)
        {
            System.out.println("Queue Underflow");
        }
    }
    void size()
    {
        System.out.println("Size of the Queue is : " + n);
    }
}
class Main
{
    
    public static void main(String[] args) {
        Test t = new Test();
        
        t.push(1);
        t.push(2);
        t.push(3);
        t.Disp();
        t.size();
        t.pop();
        t.pop();
        t.Disp();
        t.size();
    }
}
