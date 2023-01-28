class Test
{
    int x = 0;
    Node head;
    class Node
    {
        Node next;
        String data;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void AddFirst(String data)
    {
        Node n1 = new Node(data);
        Node curr  = head;
        if(head == null)
        {
            head = n1;
            n1.next = head;
            x++;
        }
        else{
            n1.next = head;
            while(curr.next != head)
                curr = curr.next; 
            head = n1;
            curr.next = n1;
            x++;
        }
    }
    public void addLast(String data)
    {
        Node n1 = new Node(data);
        Node currNode = head;
        while(currNode.next != head)
        {
            currNode = currNode.next;
            x++;
        }
        currNode.next = n1;
        n1.next = head;
    }
    public void printList()
    {
        if(head == null)
            System.out.println("List is empty");
        Node currNode = head;
        while(currNode.next != head)
        {
            System.out.print(currNode.data + " -> " );
            currNode = currNode.next;
        }
        System.out.print(currNode.data + " -> ");
        System.out.println("null");
    }
    public void deleteFirst()
    {
        if(head == null)
            System.out.println("List is empty");
        else
        {
            Node currNode = head;
            while(currNode.next != head)
                currNode = currNode.next;
            head = head.next;
            currNode.next = head;
            x--;
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Test t = new Test();
        t.AddFirst("A");
        t.AddFirst("B");
        t.addLast("c");
        t.printList();
        System.out.println("Size = " + t.x);
        t.deleteFirst();
        t.printList();
        System.out.println("Size = " + t.x);
    }
}
