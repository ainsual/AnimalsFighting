package org.example.pakageNode;

class Main {
    public static void main(String[] args) {
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newLast = new Node(value);
        last.next = newLast;
    }

    public static Node findLast(Node first) {
        Node current = first;
        while (current.next !=null) {
            current = current.next;
        }
        return current;
    }

    public static void printReverse(Node node) {
        if (node == null){
            return;
        }
        printReverse(node.next);
        System.out.print(node.value + " ");
    }

}
