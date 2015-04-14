public class BinaryTreeNode {

    private String entry;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    
    public BinaryTreeNode(String e, BinaryTreeNode l, BinaryTreeNode r)
    {
        entry = e;
        left = l;
        right = r;
    }

    public String getEntry() {
        return entry;
    }
    
    public BinaryTreeNode getLeft() {
        return left;
    }
    
    public BinaryTreeNode getRight() {
        return right;
    }
    
    public void setEntry(String str) {
        entry = str;
    }
    
    public void setLeft(BinaryTreeNode node) {
        left = node;
    }
    
    public void setRight(BinaryTreeNode node) {
        right = node;
    }

    
    // in-order traversal
    public void printFromNode()
    {
        if (left != null)
            left.printFromNode();
        System.out.println( entry );
        if (right != null)
            right.printFromNode();
    }
}