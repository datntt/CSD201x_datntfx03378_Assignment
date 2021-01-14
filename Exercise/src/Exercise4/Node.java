package Exercise4;

public class Node {
    Node next;
    Person info;

    public Node(Person x, Node p) {
        this.next = p;
        this.info = x;
    }

    public Node(Person x) {
        this (x, null);
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }
}
