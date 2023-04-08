class Node
{
    Node head,next,tail;
    int data;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    void insert(Node n)
    {
        if(head == null)
        {
            head  = n;
            tail = head;
        }
        else
        {
            tail.next = n;
            tail = n;
        }
    }
    void bubbleSort(Node n)
    {
        Node iNode = null;
        n = head;
        int t;
        if (head == null) 
            return;
        else 
        {
            while (n != null) {
                iNode = n.next;
                while (iNode!= null) 
                {
                    if (n.data > iNode.data) 
                    {
                        t = n.data;
                        n.data = iNode.data;
                        iNode.data = t;
                    }
                    iNode = iNode.next;
                }
                n = n.next;
            }
        }
    }
    void display(Node n)
    {
        if(head == null)
            System.out.println("List is empty");
        else
        {
            System.out.print("LinkedList is : ");
            while(n != null)
            {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }
        System.out.println();
    }
}
class Main
{
    public static void main(String[] args) {
        Node n = new Node(50);
        Node n1 = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(5);
        n.insert(n);
        n.insert(n1);
        n.insert(n3);
        n.insert(n2);
        System.out.println("Before sorting : ");
        n.display(n);
        n.bubbleSort(n);
        System.out.println("After Sorting : ");
        n.display(n);
    }
}
