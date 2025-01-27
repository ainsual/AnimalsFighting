package lab19.methods;
import lab19.BinaryTree;
import lab19.Node;

public class traversalRight extends BinaryTree {
    public void traversalTree(Node node) {
        System.out.print(node.value() + " ");
        if (node.right() != null) {
            traversalTree(node.right());
        }
    }
}
