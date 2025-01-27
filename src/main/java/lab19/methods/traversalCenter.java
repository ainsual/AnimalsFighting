package lab19.methods;
import lab19.BinaryTree;
import lab19.Node;

public class traversalCenter extends BinaryTree {
    public void traversalTree(Node node) {
        System.out.print(node.value() + " ");
        if (node.left() != null) {
            traversalTree(node.left());
        }
        if (node.right() != null) {
            traversalTree(node.right());
        }
        return;
    }
}
