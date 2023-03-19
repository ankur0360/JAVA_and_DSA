import java.lang.Math;
class Node
{
    int key;
    Node right;
    Node left;
    Node(int key)
    {
        this.key = key;
    }
    void Inorder(Node root)
    {
        if(root != null)
        {
            Inorder(root.left);
            System.out.print(root.key + " ");
            Inorder(root.right);
        }
    }
    void Preorder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.key + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    void Postorder(Node root)
    {
        if(root != null)
        {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.key + " ");
        }
    }
    int Degree(Node root)
    {
        if(root == null)
            return 0;
        else
            return Math.max(Degree(root.left),Degree(root.right)) + 1;
        
    }
    void DegreeLeaf(Node root,int n)
    {
        if(root == null)
            return;
        if(n == 0)
            System.out.print(root.key + " ");
        else
        {
            DegreeLeaf(root.left, n - 1);
            DegreeLeaf(root.right, n - 1);
        }
    }
    void printDegree(Node root,int n)
    {
        while(n != -1)
        {
            System.out.println(n + 1 + "Degree : ");
            if(root == null)
                return;
            if(n == 0)
                System.out.print(root.key + " ");
            else
            {
                DegreeLeaf(root.left, n - 1);
                DegreeLeaf(root.right, n - 1);
            }
            System.out.println();
            n--;
        }
    }
    int TotalNode(Node root)
    {
        if(root == null)
            return 0;
        else
            return TotalNode(root.left) + TotalNode(root.right) + 1;
    }
}
class Main
{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);
        root.right = new Node(30);
        root.right.right = new Node(60);
        root.Inorder(root);
        System.out.println();
        root.Preorder(root);
        System.out.println();
        root.Postorder(root);
        System.out.println();
        System.out.println(root.Degree(root));
        //root.DegreeLeaf(root, 3);
        root.printDegree(root, 3);
        System.out.println("Total node : " + root.TotalNode(root));
        
    }
}
