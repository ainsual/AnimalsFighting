package lab19;

public class Node implements ITree{
    public int value;
    public Node leftNode;
    public Node rightNode;

    public Node(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public void setRight(Node node) {
        this.rightNode = node;
    }

    public void  setLeft(Node node) {
        this.leftNode = node;
    }

    public Node left() {
        return leftNode;
    }

    public Node right() {
        return rightNode;
    }

    public int value() {
        return value;
    }
}
