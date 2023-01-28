class Test
{
    int x = 0;
    Node head;    //creating the Node's head
    class Node
    {
        Node next;  //creating the next of the Node
        String data;  // assign data type type String
        Node(String data) // create a constructor
        {
            this.data = data; // assign the instance data -> local data variable
            this.next = null; // assign the instance variable next -> null
        }
    }
    public void AddFirst(String data) // creating a method of add at first in Node 
    {
        Node n1 = new Node(data);     // creating class Node object throw new keyword
        if(head == null)              // if the node is empty
        {
            head = n1;                // Assign the new Node(n1) into head ,beacause Node starts with head
            x++;                      // x is for counting the value
        }
        else{
            n1.next = head;           // it assign the new node next into head
            head = n1;                // and head is assign into new Node ,i.e it swap the head into new Node
            x++;
        }
    }
    public void addLast(String data)  // creating a method of add at last in Node
    {
        Node n1 = new Node(data);     // creating class Node object throw new keyword
        Node currNode = head;         // assign the head into a temporary Node
        while(currNode.next != null)  // the loop help to go the last node next until the null
        {
            currNode = currNode.next; // update the temporary Node 
            x++;
        }
        currNode.next = n1;           // assign the last Node into New node
    }
    public void printList()           // used to print the Node
    {
        if(head == null)              // for empty Node
            System.out.println("List is empty");
        Node currNode = head;         // assign the head into a temporary Node
        while(currNode != null)
        {
            System.out.print(currNode.data + " -> " );  // printing the String data which we stored
            currNode = currNode.next; // update the temporary Node 
        }
        System.out.println("null");
        System.out.println();
    }
    public void deleteFirst()         // creating delete first Node
    {
        head = head.next;             // just assign the head into the next Node ,i.e it will start through the next Node and previous head will be deleted
    }
    public void deleteLast()
    {
        Node sLast = head;
        Node Last = head.next;
        while(Last.next != null)
        {
            Last = Last.next;
            sLast = sLast.next;
        }
        sLast.next = null;
    }
    public void deleteCount(int posi)
    {
        Node Curr = head;
        if(posi == 1)
            head = head.next;
        else
        {
            for(int i = 2;Curr != null;i ++)
            {
                if(i == posi)
                {
                    Node next = Curr.next.next;
                    Curr.next = next;

                }
                Curr = Curr.next;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.AddFirst("A");
        obj.AddFirst("b");
        obj.AddFirst("hee");
        obj.AddFirst("e");
        obj.AddFirst("m");
        obj.printList();
        //obj.deleteFirst();
        //obj.deleteLast();
        obj.deleteCount(3);
        obj.printList();
        System.out.println(obj.x);
    }
    
}
