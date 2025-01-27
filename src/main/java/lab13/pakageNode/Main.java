package lab13.pakageNode;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Node first = new Node(5);
        Random random = new Random();
        // fill list
        for (int i=0; i < 30; i++) {
            add(first, random.nextInt(1, 42));
        }

        // print first 17
        Node varNode = first;
        for (int i=0; i < 17; i++) {
            System.out.print(varNode.value + " ");
            varNode = varNode.next;
        }
        System.out.println();

        //print all
        print(first);
        System.out.println();
        // print reverse
        printReverse(first);

    }


    public static Node findLast(Node first) {
        Node current = first;
        while(current.next != null) {
            current = current.next;
        }
        return current;
    }


    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newElement = new Node(value);

        last.next = newElement;
    }


    public static void printReverse(Node node) {
        if (node == null){
            return;
        }
        printReverse(node.next);
        System.out.print(node.value + " ");
    }

    public static void print(Node node) {
        System.out.print(node.value + " ");
        printReverse(node.next);

    }
}
