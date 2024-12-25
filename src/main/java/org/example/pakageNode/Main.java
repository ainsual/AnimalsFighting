package org.example.pakageNode;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Node first = new Node(5);

        Random random = new Random();

        add(first, random.nextInt(100));
        add(first, 12);
        System.out.println(findLast(first).value);
        add(first, 17);
        add(first, 18);
        System.out.println(findLast(first).value);
        add(first, 19);
        add(first, 20);
        System.out.println(findLast(first).value);
        add(first, 21);

        System.out.println(findLast(first).value);
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

}
