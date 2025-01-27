package lab19;

public abstract class BinaryTree {

    public void addLeaf(int[] valueList, Node node) {
        for (int value: valueList) {
            addLeaf(value, node);
        }
    }

    public void addLeaf(int value, Node node) {
        if (value > node.value()) {
            if (node.right() == null) {
                Node usel = new Node(value);
                node.setRight(usel);
                return;
            } else {
                addLeaf(value, node.right());
            }
        } else {
            if (node.left() == null) {
                Node usel = new Node(value);
                node.setLeft(usel);
                return;
            } else {
                addLeaf(value, node.left()  );
            }
        }
    }
    public abstract void  traversalTree(Node node);
}
