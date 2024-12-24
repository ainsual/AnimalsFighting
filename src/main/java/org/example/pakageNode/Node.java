package org.example.pakageNode;

public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public static Node findLast(Node first) {
        Node current = first;
        while (current.next !=null) {
            current = current.next;
        }
        return current;
    }
}
