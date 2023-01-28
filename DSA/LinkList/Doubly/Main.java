class Test
{
    Node head;
    class Node
    {
        Node previous;
        Node next;
        String data;
        Node(String data)
        {
            this.data = data;
            this.next = null;
            this.previous = null;

        }
    }
    public void insertNode(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else
        {
            newNode.next = head;
            head = newNode;
            newNode.next.previous = head;
        }
        
    }
    public void insertLast(String data)
    {
        Node newNode2 = new Node(data);
        Node curr = head;
        if(head == null)
            head = newNode2;
        else
        {
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = newNode2;
            newNode2.previous = curr;
        }
    }
    public void insertCount(String data,int count)
    {
        Node newNode1 = new Node(data);
        int i = 0;
        Node curr = head;
        if(i == 1)
        {
            newNode1.next = head;
            head = newNode1;
            newNode1.next.previous = head;
        }
        else
        {
            for(i = 2;curr != null;i++,curr = curr.next)
            {
                if(i == count)
                {
                    newNode1.next = curr.next;
                    curr.next.previous = newNode1;
                    newNode1.previous = curr;
                    curr.next = newNode1;
                }
            }
        }
    }
    public void printList()
    {
        if(head == null)
            System.out.println("List is empty");
        Node cuNode = head;
        while(cuNode != null)
        {
            System.out.print(cuNode.data + "<->");
            cuNode = cuNode.next;
        }
        System.out.print("null");
    }
    public void printFromLast()
    {
        System.out.println();
        System.out.print("null");
        Node cuNode = head;
        while(cuNode.next != null)
            cuNode = cuNode.next;
        while(cuNode != null)
        {
            System.out.print("<->" + cuNode.data);
            cuNode = cuNode.previous;
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Test t = new Test();
        t.insertNode("12");
        t.insertNode("15");
        //t.insertNode("Prr");
        t.insertLast("18");
        t.insertLast("13");
        t.insertNode("20");
        t.insertCount("Add", 3);
        t.printList();
        t.printFromLast();
    }
}
