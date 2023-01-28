class Stack
{
    int stack[];
    int top=-1, max=0;
    Stack(int size)
    {
        max=size;
        stack=new int[max];
    }
    void push(int data)
    {
        if(top<max-1)
        {
            stack[++top]=data;
        }
        else
        {
            System.out.println("Stack Overflow");
        }
    }

    void pop()
    {
        if(top>-1)
        {
            System.out.println("Popped element is "+stack[top]);
            top--;
        }
        else
            System.out.println("Stack is Underflow");
    }
    void display()
    {
        if (top >= 0) {
            System.out.println("Elements in Stack is/are: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
        else
        {
            System.out.println("Stack is Empty");
        }
    }
}
public class Main {
    public static void main(String[] args) {
	      Stack myStack=new Stack(3);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.display();
    }
}
