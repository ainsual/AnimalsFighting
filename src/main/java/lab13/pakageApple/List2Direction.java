package lab13.pakageApple;

public class List2Direction {

    public Node first;

    public void add(Apple value) {
        if (first == null) {
            this.first = new Node(value);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
            current.next.prev = current;
        }
    }

    public void add(int position, Apple value) {
        Node current = first;
        Node newNode = new Node(value);
        for (int i=1; i < position; ++i) {
            if (current.next == null) return;
            current = current.next;
        }
        newNode.prev = current.prev;
        newNode.next = current;
        newNode.prev.next = newNode;
        current.prev = newNode;
    }

    public void sort() {
        boolean swapped;
        do {
            swapped = false;
            Node current = first;
            while (current.next != null) {
                if (current.value.compare(current.next.value) > 0) {
                    // swap value
                    Apple temp = current.value;
                    current.value = current.next.value;
                    current.next.value = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

    }

    @Override
    public String toString() {
        Node current = first;
        String str = "";
        while (current.next != null) {
            str += current.value + "\n";
            current = current.next;
        }
        return str;
    }

    public Apple pop() {
        // find last
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        Apple value = current.value;
        current.prev.next = null;
        return value;
    }

    public Apple remove(int position) {
        Node current = first;
        for (int i = 1; i < position; i++) {
            if (current.next == null) return null;
            current = current.next;
        }
        //swap positions
        current.prev.next = current.next;
        current.next.prev = current.prev;
        return current.value;

    }

    public void printReverse() {
        Node current = first;
        while (current.next != null) current = current.next;
        while (current.prev != null) {
            System.out.println(current.value);
            current = current.prev;
        }
    }

    public void print() {
        Node current = first;
        while (current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}