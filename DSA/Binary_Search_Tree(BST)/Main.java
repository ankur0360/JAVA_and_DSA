class TreeNode
{
    int key;
    TreeNode right;
    TreeNode left;
    TreeNode(int key)
    {
        this.key = key;
    }
    int Search(TreeNode root,int key)
    {
        if(root == null)
            return 0;
        if(root.key == key)
            System.out.println("Key found");
        if(key < root.key)
            return Search(root.left, key);
        else
            return Search(root.right, key);
    }
    int Minimum(TreeNode root)
    {
        if(root == null)
            return 0;
        else if (root.left == null)
            return root.key;
        return Minimum(root.left);
    }
    int Maximum(TreeNode root)
    {
        if(root == null)
            return 0;
        else if (root.right == null)
            return root.key;
        return Maximum(root.right);
    }
}
class Main
{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(40);
        root.left = new TreeNode(15);
        root.left.right = new TreeNode(18);
        root.Search(root, 40);
        System.out.println("Minimum value :" + root.Minimum(root));
        System.out.println("Maximum value :" + root.Maximum(root));     
    }
}
