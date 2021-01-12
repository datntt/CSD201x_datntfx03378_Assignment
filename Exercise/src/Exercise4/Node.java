package Exercise4;

public class Node {
    private Node next;
    private Person info;

    public Node(Person x, Node p) {
        this.next = p;
        this.info = x;
    }

    public Node(Person x) {
        this (x, null);
    }
}
