import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class BinaryTree {

    private BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(String str) {
        root = new BinaryTreeNode(str, null, null);
    }

    // in-order traversal
    public void printTree() {
        BinaryTreeNode r = getRoot();
        if (r != null) {
           r.printFromNode();
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public List<String> flatten() {
        List<String> flattened = new ArrayList<String>();
        addNodesToFlattened(getRoot(), flattened);
        return flattened;
    }

    private void addNodesToFlattened(BinaryTreeNode current, List<String> flattened) {
        if (current != null) {
            flattened.add(current.getEntry());
            addNodesToFlattened(current.getLeft(), flattened);
            addNodesToFlattened(current.getRight(), flattened);
        }
    }

    public static void main( String [ ] args ) {
        //
        //            t1
        //
        //           root
        //            /\
        //           n2 n3
        //          /\   \
        //        n4 n5   n6
        //        /       /\
        //       n7      n8 n9

        // in-order traversal: 7, 4, 2, 5, 1, 3, 6, 8, 9
        BinaryTree t1 = new BinaryTree("1");
        BinaryTreeNode root = t1.getRoot();
        BinaryTreeNode n9 = new BinaryTreeNode("9", null, null);
        BinaryTreeNode n8 = new BinaryTreeNode("8", null, null);
        BinaryTreeNode n7 = new BinaryTreeNode("7", null, null);
        BinaryTreeNode n6 = new BinaryTreeNode("6", n8, n9);
        BinaryTreeNode n5 = new BinaryTreeNode("5", null, null);
        BinaryTreeNode n4 = new BinaryTreeNode("4", n7, null);
        BinaryTreeNode n3 = new BinaryTreeNode("3", null, n6);
        BinaryTreeNode n2 = new BinaryTreeNode("2", n4, n5);
        root.setLeft(n2);
        root.setRight(n3);
        System.out.print("\nIn-order traversal: ");
        t1.printTree();
        System.out.println("\nT1");
        for (String entry : t1.flatten()) {
            System.out.println(entry);
        }
    }
}