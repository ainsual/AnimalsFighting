package org.example.pakageApple;

public class List2Direction {

    private Node first;

    public void add(Apple value) {
        if (first == null) {
            this.first = new Node(value);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            first.next = new Node(value);
            first.next.prev = current;
        }
    }

    public void add(int position, Apple value) {
        Node current = first;
        Node newNode = new Node(value);
        for (int i=1; i < position; ++i) {
            current = current.next;
        }
        newNode.prev = current.prev;
        newNode.next = current;
        newNode.prev.next = newNode;
        current.prev = newNode;


    }

    public void sort() {

    }

    @Override
    public String toString() {
        return "";
    }

    public Apple pop() {
        return null;
    }

    public Apple remove(int position) {
        return null;
    }

    public void printReverse() {

    }

    public void print() {

    }
}